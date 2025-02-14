package Basics;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); 

	        System.out.print("Enter a number: "); 
	        int number = scanner.nextInt(); 
	        int reversedNumber = 0; 

	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10; 
	            reversedNumber = reversedNumber * 10 + digit; 
	            number /= 10;
	        }

	        System.out.println("Reversed Number: " + reversedNumber);

	        scanner.close();
		
	}

}

// output
//Enter a number: 224455
//Reversed Number: 554422