package ca.ciccc.assignment9.problem1;

import java.util.function.IntFunction;

public class IntFunctionExample {
    public static void Test() {
        //Transform to string
        IntFunction<String> i = (x)->Integer.toString(x);

        System.out.println(i.apply(3).length());
    }
}
