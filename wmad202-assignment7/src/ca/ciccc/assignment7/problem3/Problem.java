package ca.ciccc.assignment7.problem3;

public class Problem {
    public <T> void exchangeElements(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
