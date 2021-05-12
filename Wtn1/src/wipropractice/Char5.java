package wipropractice;
import java.util.*;

public class Char5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(Character.isDigit(s))
		{
			System.out.println("Digit");
			
		}
		else if(Character.isAlphabetic(s))
		{
			System.out.println("Alphabetic");
		}
		else
		{
			System.out.println("Special Character");
		}
		

	}

}
