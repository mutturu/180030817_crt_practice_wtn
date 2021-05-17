package inheritance3;

public class CollegeStudent extends Student {
	public CollegeStudent(String name, String dob, int sid,String collegename,String yearoj) {
		super(name, dob, sid);
		this.collegename=collegename;
		this.yearoj=yearoj;
		// TODO Auto-generated constructor stub
	}

	String collegename,yearoj;
	void dispaly()
	{
		System.out.println("College Student Details="+name+" "+dob+" "+sid+" "+collegename+" "+yearoj);
	}

}
