package com.yellowmatics.java.a.nestedloop;
/**********************************************************************
find all Armstrong numbers in a given range using nested loops.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_ArmstrongNumbers_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting number of the range: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending number of the range: ");
		int end = scan.nextInt();

		System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

		// Outer loop for each number in the range
		for (int num = start; num <= end; num++) {
			int originalNum = num;
			int numDigits = 0;
			int sum = 0;
			// Count the number of digits in the current number
			for (int temp = num; temp != 0; temp /= 10) {
				numDigits++;
			}

			// Inner loop to calculate the sum of digits raised to the power of numDigits
			for (int temp = num; temp != 0; temp /= 10) {
				int digit = temp % 10;
				sum += Math.pow(digit, numDigits); // Raise the digit to the power of numDigits and add it to sum
			}

			// Check if the number is an Armstrong number
			if (sum == originalNum) {
				System.out.println(originalNum);
			}
		}

		scan.close();

	}

}
