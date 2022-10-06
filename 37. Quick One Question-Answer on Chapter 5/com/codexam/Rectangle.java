//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions

package com.codexam;

class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
