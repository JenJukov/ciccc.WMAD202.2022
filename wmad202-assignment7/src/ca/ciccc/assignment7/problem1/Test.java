package ca.ciccc.assignment7.problem1;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public void invoke() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Kutay");
        student.setGpa(79.0);
        Collection<Student> ci = Arrays.asList(student);
        int count = Algorithm1.countNumberOfElementsWithSpecificProperty(ci, new IPredicate<>());
        System.out.println("Studen gpa is bigger than 55 = " +(count == 1 ? true : false));

    }
}
