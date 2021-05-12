package wipropractice;
import java.util.*;

public class Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
			
		}
		if(c>1)
		{
			System.out.println("Not prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
		
	}

}
