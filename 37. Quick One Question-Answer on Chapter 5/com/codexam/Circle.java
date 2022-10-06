//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions


package com.codexam;

class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}


