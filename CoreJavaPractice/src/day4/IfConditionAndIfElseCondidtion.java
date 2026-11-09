package day4;

public class IfConditionAndIfElseCondidtion {

	public static void main(String[] args) {
		/*
		 * int person_age=20; if(person_age>=17) {
		 * System.out.println("Eligible for vote"); }
		 * 
		 * else { System.out.println("Not Elegible for vote"); }
		 * 
		 * int num=23; if(num%2==0) { System.out.println("Even Number"); }
		 * 
		 * else { System.out.println("Odd Numbder"); }
		 * 
		 * int number=10; if(num>0) { System.out.println("Number is positive"); } else
		 * if(num<0) { System.out.println("Number is Negative"); } else {
		 * System.out.println("Number is zero"); }
		 * 
		 * 
		 * int c=10, d=20, e=30; if(c>d && c>e) {
		 * System.out.println("a is largest number"); } else if(d>c && d>e) {
		 * System.out.println("d is largest number"); } else {
		 * System.out.println("C is largest number"); }
		 */
		if (true) {
			System.out.println(1);
		}

		else {
			System.out.println(2);
		}

		if (1 == 2) {
			if (2 == 2) {
				System.out.println("ABC");
			}
		}

		else {
			if (3 == 3) {
				System.out.println("Xyz");
			}
		}

		int weekno = 10;
		switch (weekno) {
		case 10:
			System.out.println("Monday");
			break;
		case 20:
			System.out.println("Tuesday");
			break;
		case 30:
			System.out.println("Tuesday");
			break;
		case 40:
			System.out.println("Wednesday");
			break;
		case 50:
			System.out.println("Thursday");
			break;
		case 60:
			System.out.println("Friday");
			break;
		case 70:
			System.out.println("Satday");
			break;
		default:
			System.out.println("Invalid week number");

		}

	}

}
