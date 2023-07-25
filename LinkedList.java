import java.util.*;
class Node {
    int data;
    Node next;
}
public class LinkedList {
    public static void main(String[] args) {
    Node head,middle,last;
    head = new Node();
    middle = new Node();
    last = new Node();
    head.data = 10;
    middle.data = 30;
    last.data = 40;
    head.next = middle;
    middle.next = last;
    last.next = null;

        Node tail = head;
        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.next;
        }
    }
}
  