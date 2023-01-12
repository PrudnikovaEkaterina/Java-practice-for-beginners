package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator<S> {
        public static void main(String[] args) {
            List<String> animal = new ArrayList<>();
            animal.add("djdfvfdbfd");
            animal.add("cat");
            animal.add("rabbit");
            Collections.sort(animal, new StringLengthComparator());
            System.out.println(animal);

            List<Integer> numbers =new ArrayList<>();
            numbers.add(5);
            numbers.add(20);
            numbers.add(100);
            numbers.add(5);

            Collections.sort(numbers, new java.util.Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1>o2)
                        return -1;
                    else if (o1<o2)
                        return 1;
                    else
                        return 0;
                }
            });

            System.out.println(numbers);

            List<Person> people=new ArrayList<>();
            people.add(new Person("Zate", 2));
            people.add(new Person("Aav", 1));


            Collections.sort(people, new java.util.Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                   return o1.getName().compareTo(o2.getName());
                }
            });

            System.out.println(people);
        }
    }
