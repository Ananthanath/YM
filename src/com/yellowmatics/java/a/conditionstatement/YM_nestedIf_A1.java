package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if a number is positive, negative, or zero
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_nestedIf_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number > 0) {
            System.out.println(number + " is positive.");
        } else {
            if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }
		scan.close();
	}
}
