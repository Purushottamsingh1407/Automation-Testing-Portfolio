package day2;

public class VariablesDemo {

	public static void main(String[] args) {

		int a; // variable declaration
		a = 10;// Variable initialization
		System.out.println(a);
		a = 200;// Variable re-initialization
		System.out.println(a);

		int b = 100;// Declaration and initialization in one line
		System.out.println(b);
		b = 200;
		System.out.println(b);

		// Example 3 if all the variables are of same type then we can declare them in
		// one line one way to write is
		/*
		 * int x=100; int y=200; int z=300;
		 */

		// Example 4
		// and the other way is
		/*
		 * int x,y,z; //declard variables x=100; y=200; z=300;
		 */

		// Example 5
		int x = 100, y = 200, z = 300; // here we are declaring and initializing the variables in one line
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is: " + y);
		System.out.println("The value of z is: " + z);
		System.out.println("The values are: " + x + " " + y + " " + z);

	}

}
