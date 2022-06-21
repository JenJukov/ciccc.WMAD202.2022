package ca.ciccc.wmad202.assignment3.problem10;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem10 {
    /** */

    public static boolean PolynomialEquationsEquality(String n1, String n2) {
        if(n1.equals(n2)) {
            return true;
        }
        return false;
    }
    public static boolean SingleFactorEquality(String n1, String n2) {
        if(n1.contains(n2)) {
            return true;
        }
        return false;
    }
    public static void TakeNumbers() {
        System.out.println("Question6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("SinglePolynominalFactor 1: ");
        String number1 = scanner.nextLine();
        System.out.println("SinglePolynominalFactor 2: ");
        String number2 = scanner.nextLine();
        if(number1.length() < 5) {
            System.out.println("Dont have SinglePolynominalFactor");
        } else {
            System.out.println("Ok");
            System.out.println(SingleFactorEquality(number1, number2));
            System.out.println("SAME?" + PolynomialEquationsEquality(number1, number2));
        }
    }
}
