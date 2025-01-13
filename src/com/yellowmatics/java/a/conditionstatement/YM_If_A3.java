package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
* Check if a character is a vowel or not a vowel
YellowMatics.ai
**********************************************************************/
import java.util.*;
public class YM_If_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
            scan.close();
	}
  }
}
