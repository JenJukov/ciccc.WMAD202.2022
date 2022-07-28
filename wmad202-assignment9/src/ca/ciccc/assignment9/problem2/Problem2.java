package ca.ciccc.assignment9.problem2;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Problem2 {
    //Create an ArrayList with the sum of the elements
    public static void Test() {
        BiFunction<ArrayList<Integer>, ArrayList<Integer>, ArrayList<Integer>> bi = (list1, list2) -> {
          int sum = 0;
          ArrayList<Integer> list3 = new ArrayList<>();
          for(Integer i : list1) {
              sum += i;
              list3.add(sum);
          }
          sum = 0;
          for(Integer i : list2) {
              sum += i;
              list3.add(sum);
          }
          return list3;
        };
    }
}
