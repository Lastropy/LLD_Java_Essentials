package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.Map.HashMap_Or_HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        System.out.println("\nHashMap Demo");

        Map<String, Integer> mp = new HashMap<>();

        mp.put("Raj", 3);
        mp.put("Samay", 4);
        mp.put("Kapil", 99);

        System.out.println(mp.get("Raj"));
        System.out.println(mp.getOrDefault("dsdsd", 0));

        System.out.println(mp.containsKey("das"));

        Map<Integer, List<Integer>> mp2 = new HashMap<>();
        // finds if key is absent, if yes, executes lambda function and returns the value of it, which we can then use to add more stuff
        mp2.computeIfAbsent(1, f -> new ArrayList<>()).add(2);

        // To traverse map, we need to make it into an entry set first, then traverse it
        Set<Entry<String, Integer>> st = mp.entrySet();
        for(Entry<String, Integer> en : st){
            System.out.println(en.getKey()+ " | "+ en.getValue());
        }

        Set<String> st2 = mp.keySet();
        System.out.println("\nKEYS!!");
        for(String s: st2) {
            System.out.println(s);
        }
    }
}
