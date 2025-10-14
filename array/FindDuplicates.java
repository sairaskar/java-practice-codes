package array;

import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		// Create an array of size n
		int[] arr = new int[n];

		// Input the array elements
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Find duplicates using a HashSet
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				duplicates.add(num);
			}
		}

		// Output the duplicates
		if (duplicates.isEmpty()) {
			System.out.println("No duplicates found.");
		} else {
			System.out.println("Duplicate elements: " + duplicates);
		}

		scanner.close();
	}

}
