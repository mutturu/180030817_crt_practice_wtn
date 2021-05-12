package session4;

class Person
{
	int id;
	String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
	}
}
class Customer extends Person
{
	String address;
	Customer(int id,String name,String address)
	{
		super(id,name);
		this.address=address;
	}
	void show()
	{
		System.out.println("Customer id:"+id);
		System.out.println("Customer name:"+name);
		System.out.println("Customer address:"+address);
	}
	
	
}
public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer(101,"Bhargava","Kadapa Andhra pradesh");
		c.show();

	}

}
