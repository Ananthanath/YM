package com.yellowmatics.java.a.two_d_array;
/**********************************************************************
Find the largest number in a 2D array.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_Largest_Element_in_2Darray_A {

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

		// Step 4: Find the largest number
		int largest = array[0][0]; // Assume the first element is the largest initially
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (array[i][j] > largest) {
					largest = array[i][j];
				}
			}
		}

		// Step 5: Display the largest number
		System.out.println("The largest number in the array is: " + largest);

		scan.close();

	}

}
