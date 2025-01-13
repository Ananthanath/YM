package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Write a program to check if condition
YellowMatics.ai
***********************************************************************/

import java.util.Scanner;

public class YM_If_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		if (number > 0) {
		    System.out.println("The number is positive.");
		}
        scan.close();
	}
}
