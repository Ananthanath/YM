package com.yellowmatics.java.q.two_d_array;

/**********************************************************************
Calculate the sum of each column in a 2D array.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_Sum_of_Each_Coulmn_Q {

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

		// Step 4: Calculate the sum of each column
		System.out.println("The sum of each column is:");
		for (int j = 0; j < cols; j++) {
			int colSum = 0;
			for (int i = 0; i < rows; i++) {
				colSum += array[i][j];
			}
			System.out.println("Sum of column " + j + ": " + colSum);
		}

		scan.close();

	}

}
