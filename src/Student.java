public class Student{
	private String ID;
	private String studentNumber;
	private String firstName;
	private String surname;
	private Boolean DP;
	private int mark;

	public Student(String ID, String studentNumber, String surname, String firstName, Boolean DP, int mark){
		this.ID = ID;
		this.studentNumber = studentNumber;
		this.surname = surname;
		this.firstName = firstName;
		this.DP = DP;
		this.mark = mark;
	}

	public void Display(){
		System.out.println(firstName+" "+surname+"="+mark);
	}
	
	public String toString(){
		System.out.println(firstName+" "+surname+"="+mark);
		String data = "ID: "+this.ID+"\n" +
				"Student Number: "+this.studentNumber+"\n" +
				"First names: "+this.firstName+"\n" +
				"Surname: "+this.surname+"\n" +
				"DP Status: "+this.DP+"\n" +
				"Mark: "+this.mark+"%\n";
		return data;
	}
}