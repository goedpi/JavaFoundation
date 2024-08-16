package chapter6;

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


    }
}
