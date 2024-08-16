package chapter6;

import java.util.Scanner;

public class HouseAreaImproved {
    Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        HouseAreaImproved calculator = new HouseAreaImproved();
        
        Rectangle kitchen = calculator.getRoom("kitchen"); 
        Rectangle bathroom = calculator.getRoom("bathroom");
        double area = calculator.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }
    public Rectangle getRoom(String roomname){
        System.out.println("What's the length of room " + roomname);
        double length = scanner.nextDouble(); 
        System.out.println("What's the width of room " + roomname);
        double width = scanner.nextDouble(); 

        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
