package com.yellowmatics.java.a.conditionstatement;
/**********************************************************************
Enter the animal name print Animal category
YellowMatics.ai
**********************************************************************/
import java.util.Scanner;

public class YM_SwitchCase_String_A3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String animal = scan.next();
		switch (animal) {
            case "Dog":
            case "Cat":
                System.out.println(animal + " is a Mammal.");
                break;
            case "Snake":
                System.out.println(animal + " is a Reptile.");
                break;
            case "Parrot":
                System.out.println(animal + " is a Bird.");
                break;
            default:
                System.out.println("Unknown animal type.");
        }
		scan.close();
	}

}
