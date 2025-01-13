package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
print a Greetings message EG: hi - hello
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_SwitchCase_String_A1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		switch (input) {
            case "Hello":
                System.out.println("Hi there!");
                break;
            case "Hi":
                System.out.println("Hello!");
                break;
            case "Thanks":
                System.out.println("You are Welcome");
                break;
            default:
                System.out.println("Unrecognized input.");
        }
		scan.close();
	}

}
