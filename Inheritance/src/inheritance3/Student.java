package inheritance3;

public class Student extends Person {
	int sid;
	public Student(String name, String dob, int sid) {
		super(name, dob);
		this.sid=sid;
	}
	void display()
	{
		System.out.println("Student Details"+name+" "+dob+" "+sid);
	}
	
	
	

}
