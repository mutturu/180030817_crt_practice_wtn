package session4;

class Dog
{
	void eat()
	{
		System.out.println("Dog Eats");
	}
}
class Cat extends Dog
{
	void sound()
	{
		System.out.println("Cat Sound");
	}
}
class Donkey extends Cat
{
	void sleep()
	{
		System.out.println("Donkey Sleeps");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		Donkey c=new Donkey();
		System.out.println("**** Multi-Level Inheritance Example ****");
		c.eat();
		c.sound();
		c.sleep();
	}

}
