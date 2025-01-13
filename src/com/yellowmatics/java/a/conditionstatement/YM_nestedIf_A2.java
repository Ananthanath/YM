package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if a number is divisible by 5 and even
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_nestedIf_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num % 5 == 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is divisible by 5 and even.");
            } else {
                System.out.println(num + " is divisible by 5 but not even.");
            }
        } else {
            System.out.println(num + " is not divisible by 5.");
        }
		scan.close();
	}

}
