package com.yellowmatics.java.a.methods;

/**********************************************************************
Write program to perform addition the two integers
YellowMatics.ai
**********************************************************************/

import java.util.Scanner;

public class YM_With_Arguments_With_Return_A1 {
	
	public static void main(String[] args) {
		YM_With_Arguments_With_Return_A1 obj = new YM_With_Arguments_With_Return_A1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the carPrice: ");
		int carPrice = scan.nextInt();
		System.out.println("Enter the gst: ");
		int gst = scan.nextInt();
		int totalPrice = obj.addition(carPrice,gst);
		System.out.println("The total price is "+totalPrice);
		scan.close();
	}
	int addition(int car,int gst)
	{
		int add= car+gst;
		return add;
	}

}
