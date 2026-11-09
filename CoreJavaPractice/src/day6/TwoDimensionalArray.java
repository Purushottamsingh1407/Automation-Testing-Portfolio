package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*
		 * int a[][]=new int[5][6]; a[0][0]=100; a[0][1]=200; a[1][0]=300; a[1][1]=400;
		 * a[2][0]=500; a[2][1]=600; a[3][0]=700; a[3][1]=800; a[4][0]=900;
		 * a[4][1]=1000;
		 */

//Approach 
		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 }, { 700, 800 }, { 900, 1000 } };
//Find size of an array 
		System.out.println(a.length);// returns number of rows
		System.out.println(a[0].length);// Returns number of columns in specific rows

//Read single value from an array 
		System.out.println(a[1][1]);

//read data in two dimension
		/*
		 * for(int i=0;i<=4;i++) { for(int j=0;j<=1;j++) { System.out.println(a[i][j]);
		 * } }
		 */

//Enhanced for Loop 
		for (int arr[] : a) {
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
