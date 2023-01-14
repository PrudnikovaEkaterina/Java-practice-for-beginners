package queue;

import comparable.Person;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main_queue {
    public static void main(String[] args) {

//        Приоритетная очередь

       Queue<Customer> customersPriorityQueue=new PriorityQueue<>(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getPriority()>o2.getPriority())
                    return 1;
                else if (o1.getPriority()<o2.getPriority())
                    return -1;
                else
                    return 0;
            }
        });

        customersPriorityQueue.add(new Customer("Rfnz", 5));
        customersPriorityQueue.add(new Customer("Ggrj", 4));
        customersPriorityQueue.add(new Customer("Dgmk", 7));
        customersPriorityQueue.add(new Customer("Rfnz", 2));

        System.out.println(customersPriorityQueue);

//        Очередь по принципу FIFO (first in - first out)

        Queue<Person> people1=new LinkedList<>();
        Person person1=new Person(1, "Ghjkk");
        Person person2=new Person(2, "Svnutv");
        Person person3=new Person(3, "Ip[ljng");

        people1.add(person3);
        people1.add(person1);
        people1.add(person2);

        System.out.println(people1);

//        Очередьпо принципу FIFO (first in - first out) с ограниченной емкостью

        Queue<Person> people2=new ArrayBlockingQueue<>(4);
        people2.add(person3);
        people2.add(person1);
        people2.add(person2);

        people2.remove();
        System.out.println(people2);
        System.out.println(people2.peek());

}}
