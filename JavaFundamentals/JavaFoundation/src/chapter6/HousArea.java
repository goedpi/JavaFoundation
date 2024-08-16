package chapter6;

import java.util.Scanner;

public class HousArea {
    public static void main(String[] args) {
        Rectangle house1 = new Rectangle();
        house1.setLength(1535);
        house1.setWidth(2352);
        double areaOfRoom1 = house1.calculateArea();

        System.out.println(areaOfRoom1);
        Rectangle house2 = new Rectangle(100, 50);
        double areaOfRoom2 = house2.calculateArea();

        System.out.println(areaOfRoom2);
        collectHouseDetails();

    }

    public static void collectHouseDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your houses length");
        double houseLength = scanner.nextDouble();
        System.out.println("What's your houses width");
       
        double houseWidth = scanner.nextDouble();
        Rectangle promptedRectangle = new Rectangle(houseLength, houseWidth);

        System.out.println("The area of your house is " + promptedRectangle.calculateArea());
    }
}
