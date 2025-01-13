package com.yellowmatics.java.q.nestedloop;
/**********************************************************************
find all Armstrong numbers in a given range using nested loops.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_ArmstrongNumbers_Q {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting number of the range: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending number of the range: ");
		int end = scan.nextInt();

		System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

		scan.close();

	}

}
