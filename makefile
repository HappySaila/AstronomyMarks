# Makefile for AstronomyDatabase

SRCDIR = src
BINDIR = bin

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR):$(JUNIT)

vpath %.java $(SRCDIR)
vpath %.class $(BINDIR)

# define general build rule for java sources
.SUFFIXES:  .java  .class

.java.class:
	$(JAVAC)  $(JFLAGS)  $<

#default rule - will be invoked by make
all: Student.class Database.class StudentNode.class AstronomyTree.class AstronomyDatabase.class\
	Interface.class\

clean:
	@echo "Removing class files, coverage traces and reports."
	@rm -f  $(BINDIR)/*.class
	@rm -f $(BINDIR)/*/*.class
int:
	java -ea -cp $(BINDIR) Interface