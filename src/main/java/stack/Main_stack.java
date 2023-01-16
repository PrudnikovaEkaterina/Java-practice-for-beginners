package stack;

import java.util.Stack;

public class Main_stack {
    public static void main(String[] args) {
//        Работает по принципу LIFO (Last in - First out)
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
