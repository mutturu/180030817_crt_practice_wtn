package inheritance3;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Pers0n","16-16-2000");
		System.out.println("Teacher Details:");
		Teacher t=new Teacher("Teacher Name","Teacher dob",150000,"Teacher subject ");
		t.display();
		System.out.println("Student Details:");
		Student s=new Student("Student name","Student dob",150000);
		s.display();
		System.out.println("College Student Details:");
		CollegeStudent cs=new CollegeStudent("College Student name"," dob",150000,"College Nmae","Year of Joinined");
		cs.dispaly();
		

	}

}
