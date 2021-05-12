package session4;

import java.util.*;
class Typeof
{
	void type()
	{
		System.out.println("zero args");
		
	}
	void type(int a,int b)
	{
		System.out.println("Two args in int="+a+" "+b);
		
	}
	void type(double a,double b)
	{
		System.out.println("Two args in Double="+a+" "+b);
	}
}

public class Polyrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typeof t=new Typeof();
		t.type();
		t.type(10,20);
		t.type(15.0,80.9);

	}

}
