//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions

package com.codexam;

class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }
}