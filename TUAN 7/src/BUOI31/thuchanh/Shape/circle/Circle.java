package BUOI31.thuchanh.Shape.circle;

import BUOI31.thuchanh.Shape.shape.Shape;

public class Circle extends Shape {
    private double radius = 1;
    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Which a sub class of " +
                super.toString() +
                '}';
    }
}
