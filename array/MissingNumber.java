package array;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array (n)
		System.out.print("Enter the size of the array (n): ");
		int n = scanner.nextInt();

		// Create an array of size n-1
		int[] arr = new int[n - 1];

		// Input the array elements
		System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + ":");
		for (int i = 0; i < n - 1; i++) {
			arr[i] = scanner.nextInt();
		}

		// Calculate the sum of the first n natural numbers
		int totalSum = n * (n + 1) / 2;

		// Calculate the sum of the array elements
		int arraySum = 0;
		for (int num : arr) {
			arraySum += num;
		}

		// The missing number is the difference between totalSum and arraySum
		int missingNumber = totalSum - arraySum;

		// Output the missing number
		System.out.println("The missing number is: " + missingNumber);

		scanner.close();
	}
}
