package com.yellowmatics.java.a.nestedloop;

/**********************************************************************
find all Perfect numbers in a given range using nested loops.
YellowMatics.ai
***********************************************************************/
import java.util.Scanner;

public class YM_PrimeNumber_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Input the range
		System.out.print("Enter the start of the range: ");
		int start = scan.nextInt();
		System.out.print("Enter the end of the range: ");
		int end = scan.nextInt();

		// Loop through the given range
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		for (int num = start; num <= end; num++) {
			boolean isPrime = true; // Assume the number is prime

			// Nested loop to check divisibility
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) { // If num is divisible by i, it's not prime
					isPrime = false;
					break; // No need to check further, exit the loop
				}
			}

			// If isPrime is still true, num is prime
			if (isPrime && num > 1) {
				System.out.print(num + " ");
			}
		}
		// Close the scanner object
		scan.close();

	}

}
