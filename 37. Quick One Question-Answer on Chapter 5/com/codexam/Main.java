package com.codexam;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);
        System.out.println("Area is " + rectangle.getArea());
        System.out.println("Perimeter is " + rectangle.getPerimeter());
        Circle circle = new Circle(2);
        System.out.println(circle);
        System.out.println("Area is " + circle.getArea());
        System.out.println("Perimeter is " + circle.getPerimeter());
        Square square = new Square(2);
        System.out.println(square);
        System.out.println("Area is " + square.getArea());
        System.out.println("Perimeter is " + square.getPerimeter());
        Sphere sphere = new Sphere(2);
        System.out.println(sphere);
        System.out.println("Area is " + sphere.getArea());
        System.out.println("Perimeter is " + sphere.getPerimeter());


    }
}
