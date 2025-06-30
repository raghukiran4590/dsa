package practice.algo.LinkedList;

import java.util.LinkedList;

public class ImplementQueue {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //Adding elements in stack
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        //Removing elements from stack
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());
    }
}
