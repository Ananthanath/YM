package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Categorize age as children, teen, adult, senior  
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_if_else_if_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
        if (age < 13) {
            System.out.println("Category: Child");
        } else if (age < 20) {
            System.out.println("Category: Teen");
        } else if (age < 60) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior");
        }
        scan.close();
	}
}
