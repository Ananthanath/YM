package com.yellowmatics.java.a.two_d_array;
/**********************************************************************
Calculate the sum of each row in a 2D array.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_Sum_of_Each_Row_A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Step 1: Take dimensions of the 2D array
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();

		System.out.println("Enter the number of columns:");
		int cols = scan.nextInt();

		// Step 2: Initialize the 2D array
		int[][] array = new int[rows][cols];

		// Step 3: Take user input to fill the 2D array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element at (" + i + ", " + j + "): ");
				array[i][j] = scan.nextInt();
			}
		}

		// Step 4: Calculate the sum of each row
		System.out.println("The sum of each row is:");
		for (int i = 0; i < rows; i++) {
			int rowSum = 0;
			for (int j = 0; j < cols; j++) {
				rowSum += array[i][j];
			}
			System.out.println("Sum of row " + i + ": " + rowSum);
		}

		scan.close();

	}

}
