package com.yellowmatics.java.a.two_d_array;

/**********************************************************************
Write a program to declare a 2D array of size 3x3 and initialize it with values.
Print the array.
YellowMatics.ai
 ***********************************************************************/

public class YM_literals_Input_2Darray_A {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
