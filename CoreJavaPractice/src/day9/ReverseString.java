package day9;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
String s="Selenium";
String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse string:"+ rev);
		
		//Approach 2 for reverse a string by conveting string to array 
		String a="Welcome";
		String reverse=" ";
		char d[]=a.toCharArray();
		System.out.println(Arrays.toString(d ));
		for(int i=d.length-1;i>=0;i--)
		{
            reverse=reverse+d[i];
		}
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
	}

}
