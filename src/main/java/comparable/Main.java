package comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> peopleSet=new TreeSet<>();
        peopleSet.add(new Person(4, "Aa"));
        peopleSet.add(new Person(2, "Vanya"));
        peopleSet.add(new Person(3, "Mashahhhh"));
        peopleSet.add(new Person(1, "Bas"));
        peopleSet.add(new Person(2, "Vanya"));

        System.out.println(peopleSet);
    }
}
