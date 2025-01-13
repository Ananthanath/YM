package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
*  Check if a number is even or odd print output
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;
public class YM_If_else_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
		scan.close();
	}

}
