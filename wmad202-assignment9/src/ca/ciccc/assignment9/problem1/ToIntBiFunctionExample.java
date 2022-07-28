package ca.ciccc.assignment9.problem1;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {
    public static void Test() {
        //Show the next even number in the sum
        ToIntBiFunction<String,String> i  = (x,y) -> Integer.parseInt(x) + Integer.parseInt(x);
        System.out.println(i.applyAsInt("2","3"));
    }
}
