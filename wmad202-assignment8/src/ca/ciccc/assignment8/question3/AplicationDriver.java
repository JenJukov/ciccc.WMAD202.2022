package ca.ciccc.assignment8.question3;
import ca.ciccc.assignment8.question2.Shape;

public class AplicationDriver {
    public enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom;

        public enum Custom {}
    }

    static class MyGeometry {
        public void calculateAreaAndPerimeter(Shape shape) {
            if(!ShapeType.Custom.class.isInstance(shape)) {
                shape.perimeter();
                shape.area();
            } else {
                shape.perimeter();
            }
        }
    }

    public static void main() {
        invoke();
    }

    public static void invoke() {
        ShapeType s1Type = ShapeType.Rectangle;
        int[] slSides = {10, 20};
        Shape s = new Shape(s1Type, slSides) {

            @Override
            public float perimeter() {
                if(slSides.length <= 1) {
                    return (slSides[0] + slSides[0]) * 2;
                } else {
                    return (slSides[1] + slSides[0]) * 2;
                }
            }

            @Override
            public float area() {
                if(slSides.length <= 1) {
                    return slSides[0] * slSides[0];
                } else {
                    return slSides[0] * slSides[1];
                }
            }
        };
        MyGeometry mg = new MyGeometry();
        mg.calculateAreaAndPerimeter(s);
        int[] slSides2 = {10};
        ShapeType s2Type = ShapeType.Square;
        Shape s2 = new Shape(s2Type, slSides2) {
            @Override
            public float perimeter() {
                if(slSides2.length <= 1) {
                    return slSides2[0] * 2 + slSides2[0] * 2;
                } else {
                    return (slSides2[1] * 2) + (slSides2[0] * 2);
                }
            }

            @Override
            public float area() {
                if(slSides2.length <= 1) {
                    return slSides2[0] * slSides2[0];
                } else {
                    return slSides2[0] * slSides2[1];
                }
            }
        };
        mg.calculateAreaAndPerimeter(s2);
        int[] slSides3 = {12};
        ShapeType s3Type = ShapeType.Circle;
        Shape s3 = new Shape(s3Type, slSides3) {
            @Override
            public float perimeter() {
                return (float) (2 * Math.PI * slSides3[0]);
            }

            @Override
            public float area() {
                if(slSides3.length <= 1) {
                    return (float) (Math.PI * slSides3[0] * slSides3[0]);
                } else {
                    return (float) (Math.PI * slSides3[0] * slSides3[1]);
                }
            }
        };
        mg.calculateAreaAndPerimeter(s3);
        int[] slSides4 = {8, 12, 12};
        ShapeType s4Type = ShapeType.Custom;
        Shape s4 = new Shape(s4Type, slSides4) {
            @Override
            public float perimeter() {
                if(slSides4.length <= 1) {
                    return (slSides4[0] * 2) + (slSides4[0] * 2);
                } else {
                    return (slSides2[0] * 2) + (slSides2[0] * 2);
                }
            }

            @Override
            public float area() {
                if(slSides4.length <= 1) {
                    return slSides4[0] * slSides4[0];
                } else {
                    return slSides2[0] * slSides2[0];
                }
            }
        };
        mg.calculateAreaAndPerimeter(s4);
    }
}
