package ca.ciccc.assignment9.problem1;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void Test() {
        //Put the string in upperCase
        UnaryOperator<String> i  = (x)-> x.toUpperCase();

        System.out.println(i.apply("java2s.com"));
    }
}
