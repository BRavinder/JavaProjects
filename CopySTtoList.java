import java.util.*;
public class CopySTtoList {
    public static void main(String[] args) {
        // Copy elements from Stack to LList
        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();
        // Add elements to the stack
        s1.push("hello");
        s1.push("world");
        l2.addAll(s1);
        System.out.print(l2);

            System.out.println();
            
        // Iterating over the elements
        Iterator it1 = l2.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next()+ " ");
        }
    }
    
}
