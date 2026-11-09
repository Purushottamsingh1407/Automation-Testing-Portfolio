package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {

//Example1:Print num 1 to 10
		/*
		 * int i=1; while(i<=10) { System.out.println(i); i++; }
		 */

		// Print hello message 10 time
		/*
		 * int i=1; while(i<=10) { System.out.println("Hello"); i++; }
		 */

		// Print even number 1to 10
		/*
		 * int i=2; while(i<=10) { System.out.println(i); i=i+2; }
		 */

		/*
		 * //Method 2
		 * 
		 * int i=1; while(i<=10) { if(i%2==0) { System.out.println(i); } i++; }
		 * 
		 */

		/*
		 * int i=1; while(i<=10) { if(i%2!=0) { System.out.println(i); } i++; }
		 */

		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

	}

}
