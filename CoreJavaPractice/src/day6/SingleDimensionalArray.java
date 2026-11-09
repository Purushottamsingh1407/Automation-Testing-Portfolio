package day6;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
//Declearing Array
//Approch 1
		/*
		 * int a[]=new int[5]; a[0]=10; a[1]=20; a[2]=30; a[3]=40; a[4]=50;
		 */

//decleration of array approach 2
		int a[] = { 10, 20, 30, 40, 50, };
		System.out.println(a.length);// Returns lenght of an array
		System.out.println(a[2]);// read single value from array
		System.out.println(Arrays.toString(a));

		for (int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
		// For each loop
		for (int x : a) {
			System.out.println(x);
		}

	}

}
