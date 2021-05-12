package wipropractice;

import java.util.Scanner;

public class Positiveornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}

	}

}
