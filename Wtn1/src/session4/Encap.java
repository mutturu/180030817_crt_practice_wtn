package session4;

class Employee
{
	private int id,salary;
	private String name;
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	void setSal(int salary)
	{
		this.salary=salary;
		
	}
	int getSal()
	{
		return salary;
		
		
	}
}
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(100);
		e.setName("Bargava");
		e.setSal(45555);
		System.out.println("Employee id:"+e.getId());
		System.out.println("Employee id:"+e.getName());
		System.out.println("Employee id:"+e.getSal());
		

	}

}
