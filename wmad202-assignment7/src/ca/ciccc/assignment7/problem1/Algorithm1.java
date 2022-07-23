package ca.ciccc.assignment7.problem1;

import java.util.Collection;

public class Algorithm1<T,S> {
    public static <T> int countNumberOfElementsWithSpecificProperty(Collection<T> c, Predicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (elem instanceof Student){
                if (p.test(((Student) elem).getGpa()))
                    ++count;
            }

        return count;
    }
}
