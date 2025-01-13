package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Enter Fruit name print fruit price EG:Apple $2 per kg
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_SwitchCase_String_A2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fruit = scan.next();
        switch (fruit) {
            case "Apple":
                System.out.println("Price: $2 per kg");
                break;
            case "Banana":
                System.out.println("Price: $1 per dozen");
                break;
            case "Orange":
                System.out.println("Price: $3 per kg");
                break;
            default:
                System.out.println("Fruit not available.");
        }
        scan.close();
	}

}
