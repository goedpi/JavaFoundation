package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15; 
        int maxhours = 40; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours have you worked?");

        double hoursworked = scanner.nextDouble(); 
        //validate input
        while (hoursworked > maxhours || hoursworked < 1) {
            System.out.println("Error: Working hours must be between 1 and 40. Please try again");
            hoursworked = scanner.nextDouble();
          
        }
        double gross = rate * hoursworked; 

        System.out.println("Gross pay: $" + gross);

    }
}
