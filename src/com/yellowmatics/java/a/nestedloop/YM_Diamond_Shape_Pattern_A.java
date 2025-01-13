package com.yellowmatics.java.a.nestedloop;
/**********************************************************************
Write a program to print Diamond Shape Pattern
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *  
developed by YellowMatics.ai
***********************************************************************/
import java.util.Scanner;

public class YM_Diamond_Shape_Pattern_A {

	public static void main(String[] args) {
		int row, i, j, space = 1;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner scan = new Scanner(System.in);  
		row = scan.nextInt();  
		space = row - 1;  
		for (j = 1; j<= row; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		space = 1;  
		for (j = 1; j<= row - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (row - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}
	}

}
