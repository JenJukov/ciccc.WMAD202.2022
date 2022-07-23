package ca.ciccc.assignment7.main;

import ca.ciccc.assignment7.problem1.Test;
import ca.ciccc.assignment7.problem2.IsCompile;
import ca.ciccc.assignment7.problem3.Problem;
import ca.ciccc.assignment7.problem4.Test4;
import ca.ciccc.assignment7.problem5.Test5;

public class Assignment7Driver {
    public static void run() {
        //problem1
        Test test = new Test();
        test.invoke();

        //problem2
        IsCompile isCompile = new IsCompile();
        isCompile.answer();

        //problem3
        Problem problem = new Problem();
        String[] a = {"a", "b"};
        problem.exchangeElements(a, 1, 1);

        //problem4
        Test4 test4 = new Test4();
        test4.main();

        //problem5
        Test5 test5 = new Test5();
        try {
            test5.invoke();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
