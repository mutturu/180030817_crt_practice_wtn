package inheritancepractice;
class Animal
{
	void eat()
	{
		System.out.println("Animals Eats Vegetables and Grass ");	
	}
	void sleep()
	{
		System.out.println("Animals are slepping Everday ");
	}
}
class Bird extends Animal
{
	void eat()
	{
		System.out.println("birds Eats Grains");
	}
	void sleep()
	{
		System.out.println("Birds also sleeping Everday" );
	}
	void fly()
	{
		System.out.println("Bird flys");
		
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Animals behaviour:");
		Animal ab=new Animal();
		ab.eat();
		ab.sleep();
		System.out.println("Birds Behaviour");
		Bird b=new Bird();
		b.eat();
		b.fly();
		b.sleep();
	}

}
