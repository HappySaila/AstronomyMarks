public class Student{
	private String ID;
	private String studentNumber;
	private String firstName;
	private String surname;
	private boolean DP;
	private int mark;
	
	public int getMark(){
		return mark;
	}
 	public Student(String ID, String studentNumber, String surname, String firstName, Boolean DP, int mark){
		this.ID = ID;
		this.studentNumber = studentNumber;
		this.surname = surname;
		this.firstName = firstName;
		this.DP = DP;
		this.mark = mark;
	}

	public String toString(){
		return firstName+" "+surname+"="+mark+"%";
	}
	
	public void Display(){
		String data = "ID: "+this.ID+"\n" +
				"Student Number: "+this.studentNumber+"\n" +
				"First names: "+this.firstName+"\n" +
				"Surname: "+this.surname+"\n" +
				"DP Status: "+this.DP+"\n" +
				"Mark: "+this.mark+"%\n";
		System.out.println(data);
	}
}