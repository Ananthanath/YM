package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
print Day of the week input as integer Eg:1 for Monday
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_SwitchCase_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day.");
        }
		scan.close();
	}

}
