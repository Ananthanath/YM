package com.yellowmatics.java.a.nestedloop;

/**********************************************************************
To find all perfect numbers in a given range using a nested loop
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_PerfectNumber_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Take the range input from the user
		System.out.print("Enter the start of the range: ");
		int start = scan.nextInt();
		System.out.print("Enter the end of the range: ");
		int end = scan.nextInt();

			System.out.println("Perfect numbers in the range " + start + " to " + end + " are:");

		// Loop through the range to find perfect numbers
		for (int num = start; num <= end; num++) {
			int sum = 0;

			// Find divisors of the number and calculate their sum
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}

			// If the sum of divisors equals the number, it's a perfect number
			if (sum == num && num != 0) {
				System.out.println(num); // Print the perfect number
			}
		}

		scan.close();

	}

}
