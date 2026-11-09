package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
//String s="Welcome";		
		String s = new String("Welcome");
		System.out.println(s);
//Lenght()-Returns length of string
		s.length();
		System.out.println(s.length());

//Concat()-join String
		String s1 = "Welcome";
		String s2 = "to java";
		String s3 = "Programming";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1 + s2 + s3);
		System.out.println(s1.concat(s2).concat(s3));
//Trim remove spacs from right and left		
		s = "    welcome   ";
		System.out.println("before trimming:" + s.length());
		s = s.trim();
		System.out.println("After trim:" + s.length());
		System.out.println(s);
//charAt()returns a charcter based on index and here index starts from zero 
		s1 = "welcome";
		s2 = "Welcome";
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(5));

		// Contains() returns true or false
		System.out.println(s.contains("lco"));// true
		System.out.println(s.contains("Lco"));// false it is case senstive
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		// Repalce single character or sequence if character in a string

		s = "Welcome to selenium java python pythpn programming ";
		System.out.println(s.replace('e', '0'));
		System.out.println(s.replace("python", "c#"));

		// Substring()-extracts substring from the main string
		s = "Welcome";
		System.out.println(s.substring(2, 5));
		System.out.println(s.substring(2, 6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

//split()-split/divided the string into multiple parts based on delimiters		
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(0);
		System.out.println(1);

//Ex3 replace
		String amount = "$15,20,555";// out we want 152055
		System.out.println(amount.replace("$", "").replace(",", ""));

//Ex4
		s = "abc,123@xyz";// output we want abc,123,xyz
		/*
		 * String a1[]=s.split(",");//abc, 123@xyz
		 * System.out.println(Arrays.toString(a1)); System.out.println(a1[0]);
		 * System.out.println(a1[1]);
		 * 
		 * String a2[]=a1[1].split("@"); System.out.println(a2[0]);//xyz
		 * System.out.println(a2[1]);//123
		 */

	}

}
