package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Perform Arithmetic operations +*-/ EG: char operation = '+'; A+B;
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_SwitchCase_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		char operation = scan.next().charAt(0);
		
        switch (operation) {
            case '+': System.out.println("Sum: " + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/': System.out.println("Quotient: " + (a / b)); break;
            default: System.out.println("Invalid operation.");
        }
        scan.close();
	}

}
