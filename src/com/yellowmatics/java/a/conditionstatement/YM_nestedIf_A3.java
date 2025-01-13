
package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
 Get age and mark as input check Scholarship eligibility greater than 80%
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_nestedIf_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	 age = scan.nextInt();
		int marks = scan.nextInt();
		if (age >= 18) {
            if (marks >= 80) {
                System.out.println("Eligible for scholarship.");
            } else {
                System.out.println("Not eligible for scholarship due to low marks.");
            }
        } else {
            System.out.println("Not eligible for scholarship due to age.");
        }
		scan.close();
	}

}
