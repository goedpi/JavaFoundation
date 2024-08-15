package chapter3;

import java.util.Scanner;
public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10; 
        System.out.println("Enter the number of sales you made this week:");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();

        if (sales >= quota) {
            System.out.println("Congrats! Quota is reached");
            //if sales is over the quota amount show how much
            if (sales > quota) {
                int salesOver = sales - quota;
                System.out.println("You are " + salesOver + " sales over the amount, keep on going!");
            }

        } else{
            int SalesShort = quota - sales;
            System.out.println("You are " + SalesShort + " Sales Short");

        }
    }
}

