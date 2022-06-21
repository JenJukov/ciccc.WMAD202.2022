package ca.ciccc.wmad202.assignment3.problem2;

import java.util.Scanner;

public class Problem2 {
    /** */
    public static boolean PrimeNumber(int num) {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static int NextPrime(int n) {
        int result = 0;
        for(int i = n + 1; i <= n * 2; i++) {
            if(PrimeNumber(i)) {
                result = i;
                break;
            } else {
                result = 0;
            }
        }
        return result;
    }
    //Take the input number
    public static void TakeNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digit one number:");
        int n = in.nextInt();
        if(PrimeNumber(n)) {
            System.out.println("THE NUMBER IS PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        } else {
            System.out.println("THE NUMBER ISNT PRIME!");
            System.out.println("THE NEXT PRIME NUMBER IS:" + NextPrime(n));
        }
    }
}
