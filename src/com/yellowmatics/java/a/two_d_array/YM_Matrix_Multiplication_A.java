package com.yellowmatics.java.a.two_d_array;

/**********************************************************************
Write a program to Matrix Multiplication the two 2D array and print the output.
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_Matrix_Multiplication_A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Step 1: Input dimensions for the first matrix
		System.out.println("Enter the number of rows for the first matrix:");
		int rows1 = scan.nextInt();
		System.out.println("Enter the number of columns for the first matrix:");
		int cols1 = scan.nextInt();

		// Step 2: Input dimensions for the second matrix
		System.out.println("Enter the number of rows for the second matrix:");
		int rows2 = scan.nextInt();
		System.out.println("Enter the number of columns for the second matrix:");
		int cols2 = scan.nextInt();

		// Check if matrices can be multiplied
		if (cols1 != rows2) {
			scan.close();
			System.out.println(
					"Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
			return;
		}

		// Step 3: Initialize the matrices
		int[][] matrix1 = new int[rows1][cols1];
		int[][] matrix2 = new int[rows2][cols2];
		int[][] productMatrix = new int[rows1][cols2];

		// Step 4: Input elements for the first matrix
		System.out.println("Enter elements of the first matrix:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++) {
				System.out.print("Element at (" + i + ", " + j + "): ");
				matrix1[i][j] = scan.nextInt();
			}
		}

		// Step 5: Input elements for the second matrix
		System.out.println("Enter elements of the second matrix:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				System.out.print("Element at (" + i + ", " + j + "): ");
				matrix2[i][j] = scan.nextInt();
			}
		}

		// Step 6: Perform matrix multiplication
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) { // cols1 == rows2
					productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		// Step 7: Print the resultant matrix
		System.out.println("The resultant matrix after multiplication is:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				System.out.print(productMatrix[i][j] + " ");
			}
			System.out.println();
		}

		scan.close();

	}

}
