package com.yellowmatics.java.q.two_d_array;

/**********************************************************************
Write a program to Matrix Addition the two 2D array and print the output.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_Matrix_Addition_Q {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Step 1: Input dimensions of the matrices
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();

		System.out.println("Enter the number of columns:");
		int cols = scan.nextInt();

		// Step 2: Initialize two matrices and the result matrix
		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] sumMatrix = new int[rows][cols];

		// Step 3: Input elements for the first matrix
		System.out.println("Enter elements of the first matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element at (" + i + ", " + j + "): ");
				matrix1[i][j] = scan.nextInt();
			}
		}

		// Step 4: Input elements for the second matrix
		System.out.println("Enter elements of the second matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Element at (" + i + ", " + j + "): ");
				matrix2[i][j] = scan.nextInt();
			}
		}

		// Step 5: Perform matrix addition
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Step 6: Print the resultant matrix
		System.out.println("The resultant matrix after addition is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println();
		}

		scan.close();

	}

}
