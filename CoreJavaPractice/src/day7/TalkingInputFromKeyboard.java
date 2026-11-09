package day7;

import java.util.Scanner;

public class TalkingInputFromKeyboard {

	public static void main(String[] args) {
//int a=300;//this hard coded value
		Scanner sc = new Scanner(System.in);
//System.out.println("Enter a number");
		/*
		 * int a= sc.nextInt(); System.out.println("Given value of a is:"+a);
		 */
		/*
		 * double dc=sc.nextDouble(); System.out.println("Given value of dc is:"+dc);
		 */
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Your name is:" + name);

	}

}
