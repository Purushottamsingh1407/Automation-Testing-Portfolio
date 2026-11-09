package day19;

import java.util.Scanner;

public class HandelExcweption {

	public static void main(String[] args) {
		//Example 1
/*
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter a Number....");
		 int num= sc.nextInt();
		 try {
		  System.out.println(100/num);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Invalidd data provided");
			 System.out.println(e.getMessage());
			 
		 }
		   System.out.println("Program is completed");
		*/

		
		//Example 2
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5];
		  
		  System.out.println("Enter the position (0 to 4):"); int pos=sc.nextInt();
		  System.out.println("Enter the value ");
		  int value=sc.nextInt();
		  try
		  {
		  a[pos]=value;
		  }
		  catch( ArrayIndexOutOfBoundsException e)
		  {
			 
			  System.out.println("Invalid position ");
			  System.out.println(e.getMessage());
		  }
		System.out.println("Program is completed");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
