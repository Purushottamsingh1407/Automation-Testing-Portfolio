package day3;

public class OperatorDemo {

	public static void main(String[] args) {
		// Arthmetic operators
		int a = 20, b = 10;
		System.out.println("sum of a and b is:" + (a + b));
		System.out.println("Diff of a and b is:" + (a - b));
		System.out.println("Mul of a and b is:" + (a * b));
		System.out.println("Div of a and b is:" + (a / b));
		System.out.println("Modulo Div of a and b is:" + (a % b));

//Reltional/comparsion operators 

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);

//Logical Operators
		// Returns boolean value true and false
//works between 2 bollean variables 
		boolean x = true;
		boolean y = false;
		System.out.println(x & y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

	}

}
