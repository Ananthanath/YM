package com.yellowmatics.java.a.methods;

/**********************************************************************
Write program to perform subtraction the two float values
YellowMatics.ai
**********************************************************************/

import java.util.Scanner;

public class YM_Without_Arguments_With_Return_A2 {

	public static void main(String[] args) {
		float totalGroup = division();
		System.out.println("The total Group is "+totalGroup);
	}
	static int division()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the students: ");
		int students = scan.nextInt();
		System.out.println("Enter the team: ");
		int team = scan.nextInt();
		scan.close();
		return (students/team);
	}

}
