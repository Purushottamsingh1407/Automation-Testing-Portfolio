package day3;

public class TerrnaryOperators {

	public static void main(String[] args) {
// var=exp ? result1 : result2

		int a = 200, b = 100;
		int res = (a < b) ? a : b;
		System.out.println(res);

		int c = 250, d = 300;
		int result = (c > d) ? c : d;
		System.out.println(result);

//Exapmle 2
		int person_age = 20;
		String answer = (person_age > 18) ? "aligible" : "Not eligible";
		System.out.println(answer);

//Swap the numbers
		int e = 10, f = 20;

		// Swap using addition and subtraction
		e = e + f; // a = 30
		f = f - f; // b = 10
		e = e - f; // a = 20

		System.out.println("After swap: a = " + e + ", f = " + f);

	}

}
