package classandobject;
import java.util.*;
class Box
{
	int l,b,h;
	Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	int display() 
	{
		return l*b*h;
	}
	
}


public class Constructorone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		System.out.println("Volume of a Box="+b.display());
	}

}
