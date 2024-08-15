package chapter3;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);

        //added toUppercase() to prevent issues where grade was entered but in lowercase
        String grade = scanner.next().toUpperCase(); 

        String message = "";
        scanner.close();

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default: 
                message = "Error, Grade not valid";
                break; 
        }
        if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
            message = "You passed! " + message;
        } else {
            message = "Unfortunately you failed " + message;
        }
        System.out.println(message);

    }
}
