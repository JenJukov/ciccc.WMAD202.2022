package ca.ciccc.assignment8.question2;

import ca.ciccc.assignment8.question3.AplicationDriver;

public abstract class Shape {
    private String Type;
    public Shape(ApplicationDriver.ShapeType rectangle, int[] slSides) {
        Type = String.valueOf(rectangle);
    }

    public Shape(AplicationDriver.ShapeType s1Type, int[] slSides) {
        Type = String.valueOf(s1Type);
    }

    public abstract float perimeter();
    public abstract float area();
}
