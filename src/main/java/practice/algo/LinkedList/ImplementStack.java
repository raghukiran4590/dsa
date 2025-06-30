package practice.algo.LinkedList;

import java.util.LinkedList;

public class ImplementStack {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //Adding elements in stack
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);

        //Removing elements from stack
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeFirst());

    }
}
