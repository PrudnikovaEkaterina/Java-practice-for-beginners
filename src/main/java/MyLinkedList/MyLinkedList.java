package MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public String toString(){
        int [] mas=new int[size];
        int a=0;
        Node current=head;
        while (current!=null){
            mas[a++]=current.value;
            current=current.getNext();

        }
        return Arrays.toString(mas);
    }


    public int get (int val){
        if (head==null)
            throw new RuntimeException("массив пуст");
        Node current=head;
        int index=0;
        while (val!=index){
            current=current.getNext();
            index++;
        }
       if(current==null)
            throw new RuntimeException("такого элемента нет в массиве");

        return current.getValue();
        }


    public void add (int val){
        if (head==null){
            head=new Node(val);
        }
        else {
            Node current=head;
            while (current.getNext()!=null){
            current=current.getNext();
            }
            current.setNext(new Node(val));
        }
        size++;
        }

    public void remove (int val){
        if (head==null)
            return;
        if (val==0){
            head=head.next;
            size--;
            return;
        }
        if (val>=size)
            throw new RuntimeException("Нет такого элемента");
           Node current=head;
           int index=0;
           while (index<val-1){
               current=current.getNext();
               index++;
           }
           current.setNext(current.getNext().getNext());
            size--;

    }


    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public String toString(){
            return String.valueOf(value);
        }
    }
}
