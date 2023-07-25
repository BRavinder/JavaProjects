import java.util.LinkedList;
import java.util.Stack;
public class CyrculerList {
    Node head, tail;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    void insertElements(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void displayElements(){
        Node n1 = head;
        if(tail == null){
            System.out.println("circular LL is Empty, othing to display");
        }
        else {
            do {
                System.out.println(n1.data);
                n1=n1.next;
            }while(n1.next!=head);
        }
    }
    void deleteElements(){
        if(tail!=null){
            head =head.next;
            tail.next = head;
        }else {
            head = tail = null;
        }
    }
    public static void main(String[] args) {
        CyrculerList l1 = new CyrculerList();
            l1.insertElements(2);
            l1.insertElements(7);
            l1.insertElements(8);
            l1.insertElements(5);
            l1.displayElements();
            l1.deleteElements();
        }
}