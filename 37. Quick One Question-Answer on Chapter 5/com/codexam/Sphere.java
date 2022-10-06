//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions

package com.codexam;

class Sphere extends Rectangle {
    public Sphere(double radius) {
        super(radius, radius);
    }
    public double getRadius() {
        return getLength();
    }
    public void setRadius(double radius) {
        setLength(radius);
        setWidth(radius);
    }
    public void setWidth(double radius) {
        setRadius(radius);
    }
    public void setLength(double radius) {
        setRadius(radius);
    }
    public String toString() {
        return "Sphere[radius=" + getRadius() + "]";
    }
}
