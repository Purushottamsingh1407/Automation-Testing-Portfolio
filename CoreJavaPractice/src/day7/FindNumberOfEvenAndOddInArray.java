package day7;

public class FindNumberOfEvenAndOddInArray {

	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 10, 15, 20, 25, 30 };
		int even = 0;
		int odd = 0;

		for (int value : a) {
			if (value % 2 == 0) {
				even++;
			}

			else {
				odd++;
			}
		}

		System.out.println("Numbr of even number is repeated:" + even);
		System.out.println("Numbr of even number is repeated:" + odd);

	}

}
