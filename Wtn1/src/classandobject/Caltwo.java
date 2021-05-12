package classandobject;
import java.util.*;
import java.math.*;
class Calculator
{
	void powerInt(int num1,int num2)
	{
		double p=Math.pow(num1, num2);
		System.out.println("powerint of num1 and num2="+p);
		
	}
	void powerDouble(double num1,double num2)
	{
		double k=Math.pow(num1, num2);
		System.out.println("powerDouble of num1 and num2"+k);
		
	}
}
public class Caltwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator sc=new Calculator();
		sc.powerInt(15, 20);
		sc.powerDouble(15.25, 45.5);
		

	}

}
