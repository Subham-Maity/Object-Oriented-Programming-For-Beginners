//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions

package com.codexam;

class Shape {
    private double length;
    private double width;
    private double radius;
    private double height;
    public Shape(double length, double width, double radius, double height) {
        this.length = length;
        this.width = width;
        this.radius = radius;
        this.height = height;
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
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
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
