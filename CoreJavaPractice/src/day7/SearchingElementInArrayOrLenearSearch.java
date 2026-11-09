package day7;

import java.util.Scanner;

public class SearchingElementInArrayOrLenearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a search_number");
		int search_num = sc.nextInt();
		boolean status = false;
		for (int i = 0; i <= 4; i++) {
			if (search_num == a[i]) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		if (status == false) {
			System.out.println("Element not found");
		}

	}

}
