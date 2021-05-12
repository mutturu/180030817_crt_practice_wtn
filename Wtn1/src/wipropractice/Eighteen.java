package wipropractice;
import java.util.*;

public class Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=n;
		int sum=0;
		while(k>0)
		{
			int rem=k%10;
			sum=sum*10+rem;
			k=k/10;
		}
		if(sum==n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
