import java.util.*;
import java.util.LinkedList;

class JavaLList {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // Add elements into the LinkedList
        l1.add(2);
        l1.add(8);
        l1.add(7);
        l1.add(5);

        // Adding an element with value 1 at index 2
        l1.add(2, 1);
        System.out.print(l1); // Output: [2, 8, 1, 7, 5]

        // Remove an element at index 2
        l1.remove(2);
        System.out.print(l1); // Output: [2, 8, 7, 5]

        // Remove the first element
        l1.removeFirst();
        System.out.print(l1); // Output: [8, 7, 5]

        // Remove the last element
        l1.removeLast();
        System.out.print(l1); // Output: [8, 7]

        // Print a new line
        System.out.println();

        // Iterating over the elements using an iterator
        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " "); // Output: 8 7
        }

        // Print a new line
        System.out.println();

        // Get the size of the LinkedList
        System.out.print(l1.size()); // Output: 2

        // Print a new line
        System.out.println();

        // Check if the LinkedList contains the element 11
        boolean b1 = l1.contains(11);
        System.out.println(b1); // Output: false
    }
}
