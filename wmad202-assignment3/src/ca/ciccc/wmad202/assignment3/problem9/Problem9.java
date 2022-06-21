package ca.ciccc.wmad202.assignment3.problem9;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem9 {

    /** */

    public static void TakeNumbers() {
        System.out.println("Question6");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while (number1 != 0) {
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if (number1 != 0) {
                numberList.add(number1);
            }
        }

        System.out.println("Please enter the index: ");
        int indexNum = scanner.nextInt();
        System.out.println("Index:" + primeVisibility(numberList, indexNum));
    }

    public static boolean PrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    static public int primeVisibility(ArrayList<Integer> list, int index) {
        int sum = 0;
        for (int i = 0; i < list.toArray().length; i++) {
            if(PrimeNumber(list.get(i))) {
                index -= sum;
                sum++;
            }
        }
        return sum;
    }
}