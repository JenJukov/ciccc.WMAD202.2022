package ca.ciccc.wmad202.assignment3.problem7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem7 {
    /** */
    public static int SearchNumber(ArrayList<Integer> arrayL, int Number) {
        int x = -1;
        if (arrayL.contains(Number)) {
            x = arrayL.indexOf(Number);
        }
        return x;
    }
    public static void TakeNumbers(){
        System.out.println("Question6");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Please enter the number: ");
        int number1 = scanner.nextInt();
        numberList.add(number1);

        while(number1 != 0){
            System.out.println("Please enter the number again (0 : stop): ");
            number1 = scanner.nextInt();
            if(number1 != 0){
                numberList.add(number1);
            }
        }

        System.out.println("Please enter one number to find: ");
        int searchNumber = scanner.nextInt();

        if(SearchNumber(numberList, searchNumber) == -1) {
            System.out.println("DIDNT FIND!");
        } else {
            System.out.println("Index:" + SearchNumber(numberList, searchNumber));
        }
    }
}
