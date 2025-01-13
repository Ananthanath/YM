package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if a person is eligible to vote or not eligible to vote
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_If_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age= scan.nextInt();
	        if (age >= 18) {
	            System.out.println("Eligible to vote.");
	        }
	        scan.close();
	}

}
