package ca.ciccc.assignment10.Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestExcepitions2<T> {
    public static class Container<T> {
        List<T> list;

        Container(List<T> list){
            this.list = list;
        }

        public Container(ArrayList<String> list) {

        }

        List<T> getList(){
            return list;
        }
    }
    public static <T> int evaluateList(Container<T> container, Predicate<T> predicate1, Predicate<T> predicate2){
        int count = 0;

        for(T t: container.getList()){
            if (predicate1.test(t)) {
                if(predicate2.test(t)) {
                    count++;
                } else {
                    try {
                        throw new Predicate1Exception("False");
                    } catch (Predicate1Exception e) {
                        throw new RuntimeException(e);
                    }
                    //throw PredicateException2
                }
            } else {
                try {
                    throw new Predicate1Exception("False");
                } catch (Predicate1Exception e) {
                    throw new RuntimeException(e);
                }
                //throw PredicateException1
            }
        }

        return count;
    }

    public void test(){
        ArrayList<String> list = (ArrayList<String>)(Arrays.asList("Exceptions", "are", "not", "fun", "kidding", "they", "are","fun"));
        Container<String> container = new Container<>(list);
        TestExcepitions2.evaluateList(container, s->s.length()>4, s->s.contains("a"));
    }
}
