package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Determine grade based on marks EG: Grade A-90, B-80
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_if_else_if_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
   
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        scan.close();
	}

}
