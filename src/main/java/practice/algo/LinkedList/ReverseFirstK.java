package practice.algo.LinkedList;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    public static void main(String[] args) {
        /*LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        System.out.println(list);

        removeElements(list, 3);
        System.out.println(list);*/

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

//        System.out.println(queue);

        removeElementsFromQueue(queue, 3);

    }

    public static void removeElementsFromList(LinkedList<Integer> list, int k) {

        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<=k; i++) {
            stack.push(list.removeFirst());
        }

//        System.out.println(stack);

        for(int i=1; i<=k; i++) {
            list.addLast(stack.pop());
        }

        for(int i=1; i<=k; i++) {
            list.addLast(list.removeFirst());
        }

    }

    public static void removeElementsFromQueue(Queue<Integer> queue, int k) {

        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<=k; i++) {
            stack.push(queue.poll());
        }

//        System.out.println(stack);

        for(int i=1; i<=k; i++) {
            queue.offer(stack.pop());
        }

//        System.out.println(queue);

        for(int i=1; i<=k; i++) {
            queue.offer(queue.poll());
        }

//        System.out.println(queue);

    }
}
