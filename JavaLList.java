import java.util.*;
class JavaLList{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        //Add elements in to the LList
        l1.add(2);
        l1.add(8);
        l1.add(7);
        l1.add(5);
        //Adding index number to a element
        l1.add(2,1);
        System.out.print(l1);

        //remove elements from the list
        System.out.println();
            l1.remove(2);
            System.out.print(l1);
         //remove first element
        System.out.println();
            l1.removeFirst();
        System.out.print(l1);

            //remove last element
            System.out.println();
                l1.removeLast();
            System.out.print(l1);
            // Print for the line
            System.out.println();
           // Iterating over the elements  
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        System.out.print(l1.size());
        System.out.println();
        boolean b1 = l1.contains(11);
        System.out.println(b1);

    }
}