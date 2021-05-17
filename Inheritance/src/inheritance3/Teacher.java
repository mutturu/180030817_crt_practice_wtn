package inheritance3;

public class Teacher extends Person {
	int salary;
	String subt;

	public Teacher(String name,String dob,int salary,String subt)
	{
		super(name,dob);
		this.salary=salary;
		this.subt=subt;
	}
	void display()
	{
		System.out.println("Teacher Details"+name+" "+dob+" "+salary+" "+subt);
	}

}
