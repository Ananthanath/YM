package com.yellowmatics.java.a.two_d_array;
/**********************************************************************
Write a program to get input from user and print all elements of a 2D array.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_User_Input_2Darray_A {

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

		// Step 4: Display the 2D array
		System.out.println("The 2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		scan.close();

	}

}
