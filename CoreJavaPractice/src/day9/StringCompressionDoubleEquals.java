package day9;

public class StringCompressionDoubleEquals {

	public static void main(String[] args) {
//Case1
		/*
		 * String s1 = "welcome"; String 
		 * s2 = "welcome"; 
		 * System.out.println(s1 == s2);
		 * System.out.println(s1.equals(s2));
		 */
		
		//Case2 
		/*
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1 == s2);
		 System.out.println(s1.equals(s2));
		*/
		//Case3
		/*
		String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		
		
	}

}
