package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15; 
        int maxhours = 40; 
        int retryCount = 0; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours have you worked?");

        double hoursworked = scanner.nextDouble(); 
        //validate input
        while (hoursworked > maxhours || hoursworked < 1 && retryCount < 5) {
            System.out.println("Error: Working hours must be between 1 and 40. Please try again");
            retryCount++; 
            //System.out.println("RetryCount = " + retryCount);
            hoursworked = scanner.nextDouble();
            
            if (hoursworked < maxhours && hoursworked > 1) {
                System.out.println("You're hours are correct and logged succesfully");
                retryCount = 0; 
            } else if (retryCount == 5) {
                System.out.println("Maximum retries are reached. Program will be terminated.");
                System.exit(0); 
            }
        }
        double gross = rate * hoursworked; 

        System.out.println("Gross pay: $" + gross);

    }
}
