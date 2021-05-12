package wipropractice;
import java.util.*;

public class Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=5,i=1;
		while(c>0)
		{
			if(i%2==0 && i%3==0 && i%5==0)
			{
				System.out.println(i+" ");
				c--;
			}
			i++;
			
		}
		

	}

}
