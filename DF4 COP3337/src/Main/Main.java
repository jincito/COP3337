package Main;

import util.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("circle", 3);
        System.out.println(circle + ":");
        System.out.println("Area of circle is: " + circle.getArea());
        System.out.println("Circumference of circle is: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle("rectangle", 6 , 4);
        System.out.println(rectangle + ":");
        System.out.println("Area of rectangle is: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is: " + rectangle.getPerimeter());

        Square square = new Square("square" , 4);
        System.out.println(square + ":");
        System.out.println("Area of square is: " + square.getArea());
        System.out.println("Perimeter of square is: " + square.getPerimeter());
    }
}