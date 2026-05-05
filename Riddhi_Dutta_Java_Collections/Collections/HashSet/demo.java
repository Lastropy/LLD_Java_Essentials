package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.Collections.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        System.out.println("HashSet demo (Doesn't remember order)");
        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(1);
        st.add(2);
        st.add(3);

        System.out.println(st);
        st.remove(1);

        System.out.println(st);
        st.clear();
        System.out.println(st.contains(1));


        // Set intersection demo
        Set<Integer> st1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> st2 = new HashSet<>(Arrays.asList(1, 2, 99, 100));

        st1.retainAll(st2); // intersection
        System.out.println("\nIntersection of 2 sets => "+st1);

        st1 = new HashSet<>(Arrays.asList(1, 2, 3));
        st1.addAll(st2); // union
        System.out.println("Union of 2 sets => "+st1);
        
        st1 = new HashSet<>(Arrays.asList(1, 2, 3));
        st1.removeAll(st2); // difference
        System.out.println("Difference of 2 sets => "+st1);

        System.out.println("\n\nLinkedHashSet demo (remembers order; LL + HashSet)");
        Set<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(3);
        lhs.add(2);

        for(int x: lhs)
            System.out.println(x);


    }
}
