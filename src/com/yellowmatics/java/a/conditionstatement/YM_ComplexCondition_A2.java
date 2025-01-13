package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
 Check blood donation eligibility with age 18 above and weight 50 above
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_ComplexCondition_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	 age = scan.nextInt();
		int weight = scan.nextInt();
        if (age >= 18 && weight >= 50) {
            System.out.println("Eligible to donate blood.");
        } else {
            System.out.println("Not eligible to donate blood.");
        }
        scan.close();
	}

}
