package Basics;

import java.util.Scanner;

public class Taskone {
	public static void main(String[] args) {
		
		
		
		
		//********* Problem 1***********printing numbers from 10-50 using loop/while loop //
//		     int number = 10; 
//        while (number <= 50) {
//            System.out.println(number);
//            number++; 
//        }
//        System.out.println("Hello World");
		
		
		// **** **********problme 2 **** to check whether the given input number is positive or negative
		
//		 Scanner scanner = new Scanner(System.in); 
//
//	        System.out.print("Enter a number: "); 
//	        double number = scanner.nextDouble(); 
//
//	        if (number > 0) {
//	            System.out.println("The number is positive.");
//	        } else if (number < 0) {
//	            System.out.println("The number is negative.");
//	        } else {
//	            System.out.println("The number is zero.");
//	        }
//
//	        scanner.close();
		
		//********** problem 3 ******* Reversing given number *****************/////
		
//		 Scanner scanner = new Scanner(System.in); 
//
//	        System.out.print("Enter a number: "); 
//	        int number = scanner.nextInt(); 
//	        int reversedNumber = 0; 
//
//	        // Reverse the number
//	        while (number != 0) {
//	            int digit = number % 10; 
//	            reversedNumber = reversedNumber * 10 + digit; 
//	            number /= 10;
//	        }
//
//	        System.out.println("Reversed Number: " + reversedNumber);
//
//	        scanner.close();

		
		//********** Program 3 **** smallest amond 3 numbers.../////
//		 Scanner scanner = new Scanner(System.in);
//
//	        
//	        System.out.print("Enter the first number: ");
//	        int num1 = scanner.nextInt();
//
//	        System.out.print("Enter the second number: ");
//	        int num2 = scanner.nextInt();
//
//	        System.out.print("Enter the third number: ");
//	        int num3 = scanner.nextInt();
//
//	        int smallest = num1;
//
//	        if (num2 < smallest) {
//	            smallest = num2;
//	        }
//
//	        if (num3 < smallest) {
//	            smallest = num3;
//	        }
//
//	        System.out.println("The smallest number is: " + smallest);
//
//	        scanner.close();
		
		
		
		
		//******* Program 4 ---- discount ////////
		
//		Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the purchased amount: ");
//        double purchasedAmount = scanner.nextDouble();
//
//        double discount = 0;
//        double finalAmount;
//
//   
//        if (purchasedAmount < 500) {
//            discount = 0; 
//        } else if (purchasedAmount >= 500 && purchasedAmount <= 1000) {
//            discount = 0.10;
//        } else {
//            discount = 0.20;
//        }
//
//        finalAmount = purchasedAmount - (purchasedAmount * discount);
//        System.out.println("Purchased Amount: " + purchasedAmount);
//        System.out.println("Discount Applied: " + (discount * 100) + "%");
//        System.out.println("Final Amount after Discount: " + finalAmount);
//
//        scanner.close();

		
		//******** program 5 ..--- pattern printing---//
	    int k = 5; 

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                
                if (j < k - i) {
                    System.out.print((k - j) + " ");
                } else {
                    
                    System.out.print((k - i) + " ");
                }
            }
            System.out.println();
        }
		

	}
	

}
