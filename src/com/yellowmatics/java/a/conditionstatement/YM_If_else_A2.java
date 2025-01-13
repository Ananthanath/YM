package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if a number is positive or negative
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_If_else_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
        if (num >= 0) {
            System.out.println(num + " is positive.");
        } else {
            System.out.println(num + " is negative.");
        }
        scan.close();
	}

}
