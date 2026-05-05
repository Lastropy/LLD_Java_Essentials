package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.Map.TreeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        System.out.println("\nTreeMap Demo!!");

        NavigableMap<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Hello55");
        mp.put(1, "Hello");
        mp.put(2, "Hello1");

        System.out.println(mp);

        Set<Entry<Integer, String>> st = mp.entrySet();
        for(Entry<Integer, String> en: st){
            System.out.println(en.getKey()+ ", "+ en.getValue());
        }

        // System.out.println(mp.pollFirstEntry());
        System.out.println(mp.floorEntry(1));
        System.out.println(mp.ceilingEntry(1));
        System.out.println(mp.higherEntry(1));
        System.out.println(mp.higherKey(1));
    }
}



