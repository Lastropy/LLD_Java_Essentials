package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        System.out.println(lst);

        int prevValue = lst.set(1, 100);
        System.out.println(prevValue+" changed to "+ 100);
        System.out.println(lst);

        List<Integer> lst2 = new ArrayList<>(lst); // Can handle any Collection
        lst2.add(5);
        System.out.println("New arraylist " + lst2);

        lst2.addAll(lst);
        System.out.println("After appending lst to lst2 => "+lst2);

        System.out.println("Index of 100 => "+lst2.indexOf(100));
        System.out.println("Last Index of 100 => "+lst2.lastIndexOf(100));

        List<Integer> lst3 = lst2.subList(0, 3); // Shallow copy; Changing it changes the main list
        System.out.println("Sublist from 0 to 3 " + lst3);

        Integer[] arrayListToArray = lst2.toArray(new Integer[0]);

        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ListIterator<Integer> li = ll.listIterator();
        
        System.out.println(li.next()); // Print current ele, then go to next index
        System.out.println(li.next());
        System.out.println(li.previous()); // Go to prev index, then print element
    }
}
