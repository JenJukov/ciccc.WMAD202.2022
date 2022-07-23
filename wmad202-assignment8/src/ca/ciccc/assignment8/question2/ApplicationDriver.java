package ca.ciccc.assignment8.question2;

public class ApplicationDriver {
    public enum ShapeType{
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }

    public static void invoke() {
        int[] slSides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, slSides) {

            //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return (slSides[1] + slSides[0]) * 2;
            }

            @Override
            public float area() {
                return slSides[0] * slSides[1];
            }
        };

        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());

        int[] slSides2 = {10, 10};
        Shape s2 = new Shape(ShapeType.Square, slSides2) {

            //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return (slSides2[1] * 2) + (slSides2[0] * 2);
            }

            @Override
            public float area() {
                return slSides2[0] * slSides2[1];
            }
        };

        System.out.println("S2's perimeter is: " + s2.perimeter());
        System.out.println("S2's area is: " + s2.area());

        int[] slSides3 = {12, 12};
        Shape s3 = new Shape(ShapeType.Circle, slSides3) {

            //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return (float) (2 * Math.PI * slSides3[0]);
            }

            @Override
            public float area() {
                return (float) (Math.PI * slSides3[0] * slSides3[1]);
            }
        };

        System.out.println("S3's perimeter is: " + s3.perimeter());
        System.out.println("S3's area is: " + s3.area());

        int[] slSides4 = {12, 12, 8};
        Shape s4 = new Shape(ShapeType.Triangle, slSides4) {

            //complete the implementation of the anonymous inner class here
            @Override
            public float perimeter() {
                return (slSides4[0] + slSides4[1] + slSides4[2]);
            }

            @Override
            public float area() {
                return (slSides4[0] * slSides4[1]) / 2;
            }
        };

        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4's area is: " + s4.area());
    }
}
