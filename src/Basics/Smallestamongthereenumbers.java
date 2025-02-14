package Basics;

import java.util.Scanner;

public class Smallestamongthereenumbers {
	public static void main(String[] args) {
		
		//********** Program 3 **** smallest amond 3 numbers.../////
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        int smallest = num1;

	        if (num2 < smallest) {
	            smallest = num2;
	        }

	        if (num3 < smallest) {
	            smallest = num3;
	        }

	        System.out.println("The smallest number is: " + smallest);

	        scanner.close();

	}

}

//Output
//Enter the first number: 11
//Enter the second number: 09
//Enter the third number: 77
//The smallest number is: 9
