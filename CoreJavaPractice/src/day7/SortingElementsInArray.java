package day7;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {
int a[]= {100,300,200,500,400,700,600,3,50,};
		System.out.println("before  shorting printing the value:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting:"+ Arrays.toString(a));
		
		//Sorting Strings in Array
		String b[]= {"a","c","b","d","e","g"};
		System.out.println("Before sorting:"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting:"+Arrays.toString(b));
		
		
	}

}
