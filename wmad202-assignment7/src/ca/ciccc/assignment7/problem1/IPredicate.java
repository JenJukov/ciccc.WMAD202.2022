package ca.ciccc.assignment7.problem1;

public class IPredicate<T> implements Predicate<T> {

    @Override
    public boolean test(Double i) { return i > 55.0; }

}
