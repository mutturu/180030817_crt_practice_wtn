package session4;
class Bank
{
	int amount=1000;
	
}
class Icici extends Bank
{
	void roi()
	{
		System.out.println(amount*4.5);
		
	}
	
}
class Hdfc extends Bank
{
	void roi()
	{
		System.out.println(amount*8.9);
	}
	
}
class Sbi extends Bank
{
	void roi()
	{
		System.out.println(amount*78);
	}
	
}
public class Heirarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Heirarical inheritance ***");
		Sbi s=new Sbi();
		s.roi();
		Hdfc h=new Hdfc();
		h.roi();
		Icici i=new Icici();
		i.roi();
		

	}

}
