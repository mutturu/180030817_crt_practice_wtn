package wipropractice;
import java.util.*;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='R'){
            System.out.println("Red");
        }
        else if(c=='B'){
            System.out.println("Blue");
        }
        else if(c=='G'){
            System.out.println("Green");
        }
        else if(c=='O'){
            System.out.println("Orange");
        }
        else if(c=='Y'){
            System.out.println("yellow");
        }
        else if(c=='W'){
            System.out.println("White");
        }
        else{
            System.out.println("Invalid");
        }

	}

}
