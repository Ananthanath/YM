package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Find the largest of three numbers 
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_if_else_if_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
        if (a > b && a > c) {
            System.out.println("Largest: " + a);
        } else if (b > c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }
        scan.close();
	}

}
