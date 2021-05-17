package overridingandpolymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape");
	}
	void erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase()
	{
		System.out.println("Erasing Square");
	}
	
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh=new Shape();
		sh.draw();
		sh.erase();
		System.out.println("Circle details:");
		Shape c=new Circle(); 
		c.draw();
		c.erase();
		System.out.println("Triangle details:");
		Shape t=new Triangle(); 
		t.draw();
		t.erase();
		System.out.println("Square details:");
		Shape s=new Square();
		s.draw();
		s.erase();

	}

}
