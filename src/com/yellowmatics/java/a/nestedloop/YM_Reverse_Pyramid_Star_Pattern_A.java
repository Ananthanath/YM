package com.yellowmatics.java.a.nestedloop;

/**********************************************************************
Write a program to print Reverse Pyramid Star Pattern
    * * * * *
     * * * *
      * * *
       * *
        *  
developed by YellowMatics.ai
***********************************************************************/
import java.util.Scanner;

public class YM_Reverse_Pyramid_Star_Pattern_A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows= scan.nextInt();  
		for (int i= 0; i<= rows-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=rows-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		} 
		scan.close();
	}
}
