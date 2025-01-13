package com.yellowmatics.java.a.nestedloop;
/**********************************************************************
Write a program to print Right Triangle Star Pattern
    *
    * *
    * * *
    * * * *
    * * * * *
developed by YellowMatics.ai
***********************************************************************/

import java.util.Scanner;
public class YM_Right_Triangle_Star_Pattern_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
	}

}
