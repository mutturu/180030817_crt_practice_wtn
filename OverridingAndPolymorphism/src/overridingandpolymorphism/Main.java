package overridingandpolymorphism;
class Fruit
{
	String fname,ftaste;
	int size;
	void eat(String fname,String ftaste,int size)
	{
		System.out.println("Friut details");
		System.out.println(fname+" "+ftaste+" "+size);
		
	}
}
class Apple extends Fruit
{
	void eat(String fname,String ftaste)
	{
		System.out.println(fname+" "+ftaste+" "+size);
	}
}
class Orange extends Fruit
{
	void eat(String fname,String ftaste)
	{
		System.out.println(fname+" "+ftaste+" "+size);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Orange Details:");
		Orange o=new Orange();
		o.eat("Orange Name", " Orange Taste",50);
		System.out.println("Apple details:");
		Apple a=new Apple();
		a.eat("Apple Name", " Apple Taste",80);

	}

}
