//You have to create a package named com.codexam
//This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
//These classes should use inheritance to properly manage the code!
//Include methods like volume, surface area and getters/setters for dimensions

package com.codexam;

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public double getSide() {
        return getLength();
    }
    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
    }
    public String toString() {
        return "Square[side=" + getSide() + "]";
    }
}


