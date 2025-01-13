package com.yellowmatics.java.a.methods;
/**********************************************************************
Write program to perform multiplication the two float values
YellowMatics.ai
**********************************************************************/

import java.util.Scanner;

public class YM_Without_Arguments_With_Return_A1 {

	public static void main(String[] args) {
		int totalwindow=multiplication();
		System.out.println("The total no of Window is "+totalwindow);
	}
	static int multiplication() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Room: ");
		int  room = scan.nextInt();
		System.out.println("Enter the Window: ");
		int window = scan.nextInt();
		scan.close();
		return room*window;
	}
	

}
