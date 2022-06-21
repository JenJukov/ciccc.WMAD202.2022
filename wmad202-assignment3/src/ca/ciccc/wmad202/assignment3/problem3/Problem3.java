package ca.ciccc.wmad202.assignment3.problem3;

import java.util.Scanner;

public class Problem3 {
    /** */
    public static void doingShape(int number1, String s) {
        if(s == "SHAPE 2" || s == "shape 2" || s == "SHAPE2" || s == "shape2") {
            while(number1 >= 0) {
                for(int i = 1; i <= number1; i++) {
                    System.out.print("*");
                }
                number1 = number1 - 1;
                System.out.printf("\n");
            }
        }
        else if(s == "SHAPE 3" || s == "shape 3" || s == "SHAPE3" || s == "shape3") {
            int controller = 0;
            int n = 1;
            while(n <= number1) {
                for(int i = 1; i <= n; i++) {
                    System.out.print("*");
                }
                n = n + 1;
                System.out.printf("\n");
            }
        }
        else if(s == "SHAPE 1" || s == "shape 1" || s == "SHAPE1" || s == "shape1") {
            for (int i = 0; i<number1; i++ ) {
                for (int j = 0; j < i; j++){
                    System.out.print(' ');
                }
                for(int f = 0; f < (number1-i)*2-5; f++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        }
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        //int n = in.nextInt();
        doingShape(5, "SHAPE 1");
    }
}
