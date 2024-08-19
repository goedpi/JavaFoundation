package chapter4;

import java.util.Scanner;

public class Cashier {
   public static void main(String[] args) {
    System.out.println("How many items would you like to scan?");
    Scanner scanner = new Scanner(System.in); 
    int quantity = scanner.nextInt(); 

    double total = 0; 

    for (int i = 1; i < quantity+1; i++) {
        System.out.println("What does item "+i + " Cost?");
        double price = scanner.nextDouble();

        total = total + price; 
    }
    scanner.close();
    System.out.println("Your total is $"+total);

   }
}
