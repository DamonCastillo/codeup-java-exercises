package shapes;

import util.Input;

import java.util.Scanner;

public class ShapeTest extends Rectangle {
    static double myShape;


    public ShapeTest(double length, double width) {
        super(length, width);
    }

    public static void main(String[] args) {

        Rectangle myShape = new Rectangle(6,4);
        System.out.println("-----------");
        System.out.println(myShape.getArea());
        System.out.println("-----------");
        System.out.println(myShape.getPerimeter());
        System.out.println("-----------");

        Square myShape2 = new Square(5);
        System.out.println(myShape2.getArea());
        System.out.println("-----------");
        System.out.println(myShape2.getPerimeter());
        System.out.println("-----------");

        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Rectangle(5,9);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());




    }
}
