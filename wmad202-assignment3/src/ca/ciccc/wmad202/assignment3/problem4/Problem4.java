package ca.ciccc.wmad202.assignment3.problem4;

import java.util.Scanner;

public class Problem4 {
    /**I*/
    public static int Repeated(int numbers[]) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // got the duplicate element
                    number = numbers[i];
                    break;
                }
            }
        }
        return number;
    }
    //Take the input number
    public static void TakeNumbers() {
        Scanner in = new Scanner(System.in);
        int n[] = new int[5];
        for(int i = 0; i < n.length; i++) {
            System.out.println("Digit one number:");
            n[i] = in.nextInt();
            if(n[i] < 1 || n[i] > 100) {
                System.out.println("Need to be greater or equal 1 and smaller than 100");
                System.out.println("Digit again:");
                n[i] = in.nextInt();
            }
        }
        if(Repeated(n) == 0) {
            System.out.println("DONT HAVE ANY REPEATED NUMBER!");
        } else {
            System.out.println("REPEATED NUMBER: " + Repeated(n));
        }
    }
}
