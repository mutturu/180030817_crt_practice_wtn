package wipropractice;

public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=10;i<=99;i++){
	            int c=0;
	            for(int j=1;j<=i;j++){
	                if(i%j==0){
	                    c++;
	                }
	            }
	            if(c==2){
	                System.out.print(i+" ");
	            }
	        }

	}

}
