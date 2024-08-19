package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static Scanner scanner = new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        
        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);

    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static double getSalary() {
        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter credit score: ");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("You have been approved");
        } else {
            System.out.println("You have been denied");
        }
    }
}
