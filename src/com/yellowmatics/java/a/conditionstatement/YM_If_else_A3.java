package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if a year is a leap year or not
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_If_else_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scan.close();
	}

}
