package ca.ciccc.wmad202.assignment3.problem8;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem8 {
    /** */
    public static void CreateList(int topLimit, int number) {
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        for(int i = 2; i <= topLimit; i++) {
            if(i % number == 0) {
                arrayL.add(i);
            }
        }
        System.out.println(arrayL);
    }
    //Take the input number
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int topLimit = in.nextInt();
        System.out.println("Digit another number:");
        int number = in.nextInt();
        if(topLimit > 40 && topLimit < 100) {
            CreateList(topLimit, number);
        } else {
            System.out.println("Need to be a number between 40 and 100!");
        }
    }

}
