package ca.ciccc.assignment7.problem4;

import java.util.Arrays;

public class Test4 {
    public void main() {
        Service service = new IService();
        service.addItemToList(Arrays.asList(1,2,3,4,5));
        service.addItemToList(Arrays.asList(1,2));
        service.removeItemFromTheList(Arrays.asList(1,2,3,4,5));
        System.out.println(service.performOperation(Arrays.asList(1,2)));
    }
}
