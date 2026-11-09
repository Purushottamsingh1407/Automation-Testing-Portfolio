package day7;

import java.util.Scanner;

public class TalkingMultipleInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		System.out.println("Sum of 2 number:" + (num1 + num2));

	}

}
