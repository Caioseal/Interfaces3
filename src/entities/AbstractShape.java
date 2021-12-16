package entities;

import enums.Color;

public abstract class AbstractShape implements Shape {

    //Attributes
    private Color color;

    //Constructor
    public AbstractShape(Color color) {
        this.color = color;
    }

    //Getter and Setter
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
