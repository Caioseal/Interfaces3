package application;

import entities.AbstractShape;
import entities.Circle;
import entities.Rectangle;
import enums.Color;

public class Main {

    public static void main(String[] args) {

        AbstractShape abstractShape1 = new Circle(Color.WHITE, 2.0);
        AbstractShape abstractShape2 = new Rectangle(Color.BLACK, 3, 5);

        System.out.println("Circle color: " + abstractShape1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", abstractShape1.area()));

        System.out.println("Rectangle color: " + abstractShape2.getColor());
        System.out.println("Rectangle area: " + abstractShape2.area());
    }
}
