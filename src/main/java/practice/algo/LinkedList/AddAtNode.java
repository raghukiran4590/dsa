package practice.algo.LinkedList;


public class AddAtNode {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        Node n6 = null;
        int indx = 1;
        int val = 70;
        Node nodeFirst = addAt(n6, val, head, indx);
        if(indx == 1) {
            Node temp = nodeFirst;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node addAt(Node at, int val, Node head, int indx) {
        if(indx == 1) {
            at = addFirst(head, val);
        } else {
            at = new Node(val);
            Node temp = head;
            Node temp1 = temp.next;
            for(int i=0; i<indx -1; i++) {
                temp = temp.next;
                if(temp1.next == null) {
                    at = addLast(temp1, val);
                    break;
                } else {
                    temp1 = temp1.next;
                }
            }
            if(at.next != null) {
                temp.next = at;
                at.next = temp1;
            }
        }
        return at;
    }

    public static Node addFirst(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }

    public static Node addLast(Node last, int val) {
        Node node = new Node(val);
        last.next = node;
        return node;
    }
}
