package entities;

import enums.Color;

public class Circle extends AbstractShape{

    //Attributes
    double radius;

    //Constructor
    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    //Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
