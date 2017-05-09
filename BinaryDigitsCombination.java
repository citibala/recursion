

package algorithms.recursion;

import java.util.Arrays;

public class BinaryDigitsCombination {

	static int[] input = new int[3];

	public void printCombination(int n) {
		if (n <= 0) {
			Arrays.stream(input).forEach(num -> System.out.print(num + " "));
			System.out.println();
		} else {
			input[n - 1] = 0;
			printCombination(n - 1);
			input[n - 1] = 1;
			printCombination(n - 1);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		BinaryDigitsCombination obj = new BinaryDigitsCombination();
		System.out.println("Binary Combinations for 3 digits:\n");
		obj.printCombination(3);
	}
}
