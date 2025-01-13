package com.yellowmatics.java.a.methods;
/**********************************************************************
Write program to perform subtraction the two float values
YellowMatics.ai
**********************************************************************/

import java.util.Scanner;

public class YM_With_Arguments_With_Return_A2 {

	public static void main(String[] args) {
		YM_With_Arguments_With_Return_A2 obj = new YM_With_Arguments_With_Return_A2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the shirt: ");
		float shirt = scan.nextInt();
		System.out.println("Enter the discount: ");
		float dis = scan.nextInt();
		float totalPrice = obj.subtraction(shirt,dis);
		System.out.println("The total price is "+totalPrice);
		scan.close();
	}
	float subtraction(float shirt,float dis)
	{
		float sub= shirt-dis;
		return sub;
	}

}
