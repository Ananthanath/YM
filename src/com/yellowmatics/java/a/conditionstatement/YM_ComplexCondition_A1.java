package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Check if it is a perfect triangle three sides must equal (60 60 60 = 180)
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_ComplexCondition_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	 angle1 = scan.nextInt();
		int angle2 = scan.nextInt();
		int angle3 = scan.nextInt();
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is not valid.");
        }
        scan.close();
	}

}
