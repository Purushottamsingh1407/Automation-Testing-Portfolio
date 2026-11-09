package day18;
//Upcasting- convertig value from smaller to larger

//int.....long
//Downcasting-converrting value from larger to smaller
//double to float
//long to int
public class TyoeCastingConcept {

	public static void main(String[] args) {
		/*
		 * //Upcasting int intvalue =100; long longvalue=intvalue;
		 * System.out.println(longvalue);
		 * 
		 * float floatvalue=10.5F; double doublevalue=floatvalue;
		 * 
		 * // Downcasting we have to convert larger type to smaller type we have to do
		 * manually
		 */
		// long longvalue=10000;
//int intvalue=(int)longvalue;

		double doublevalue = 125135.55;
		float floatvalue = (float) doublevalue;

		/*
		 * //example int i=100; double d=i; System.out.println(d);
		 */

		double d = 10.5;
		int i = (int) d;
		System.out.println(i);

	}

}
