package session4;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch=new Character('a');
		char c=ch;
		System.out.println(c);
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isDigit(c));
		System.out.println(Character.isWhitespace(c));
		System.out.println(Character.isUpperCase(65));
		System.out.println(Character.isLowerCase(c));

	}

}
