package ca.ciccc.assignment7.problem4;

import java.util.List;

public interface Service<T> {
    public List<T> addItemToList(T obj);
    public void removeItemFromTheList(T obj);
    public List<T> performOperation(List<T> obj);
}
