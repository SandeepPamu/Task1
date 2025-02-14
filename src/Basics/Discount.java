package Basics;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
//******* Program 4 ---- discount ////////
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchased amount: ");
        double purchasedAmount = scanner.nextDouble();

        double discount = 0;
        double finalAmount;

   
        if (purchasedAmount < 500) {
            discount = 0; 
        } else if (purchasedAmount >= 500 && purchasedAmount <= 1000) {
            discount = 0.10;
        } else {
            discount = 0.20;
        }

        finalAmount = purchasedAmount - (purchasedAmount * discount);
        System.out.println("Purchased Amount: " + purchasedAmount);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Final Amount after Discount: " + finalAmount);

        scanner.close();
	}
}

//Output
//Enter the purchased amount: 700
//Purchased Amount: 700.0
//Discount Applied: 10.0%
//Final Amount after Discount: 630.0