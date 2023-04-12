package Homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 3));
        people.add(new Person("Jack", 23));
        people.add(new Person("Jill", 19));
        people.add(new Person("Bill", 15));
        people.add(new Person("Ann", 54));

        Collections.sort(people, new PersonComparator());

        System.out.println("Sorted List: " + people);
    }
    /*Sorted List: [John (3), Bill (15), Jill (19), Jack (23), Ann (54)] */

}
