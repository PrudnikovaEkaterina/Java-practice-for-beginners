package MyLinkedList;

import java.util.Arrays;

// cоздать свой односвязный LL, который может хранить в себе только целые числа
public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(20);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
    }
}
