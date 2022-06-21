package ca.ciccc.wmad202.assignment3.problem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem6 {
    /**  */
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

        ArrayList<Integer> hashed = new ArrayList<>(new HashSet<>(numberList));

        System.out.println(hashed);
    }
}
