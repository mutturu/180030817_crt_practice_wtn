package session4;

public class Stringdemo {
	public static void main(String[] args) {
		String s1="How are you";
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
		String s="abc:def";
		String b[]=s.split(":");
		for(String i:b)
		{
			System.out.println(i);
		}
		char c[]=s.toCharArray();
		for(char i:c)
		{
			System.out.println(i);
		}
		String x="abc";
		String y="abc";
		if(x.compareTo(y)==0)
		{
			System.out.println("equal");
	
		}
		String z="annn";
		System.out.println(x.compareTo(z));
		System.out.println(x.concat(z));
		System.out.println(x.substring(0,2));
		String bha=" MUTTURU VEERA BHARGAVA REDDY";
		System.out.println(bha.trim());
	}


}
