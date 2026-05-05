package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class demo {
    public static void main(String[] args) {
        // By default, PQ are min heap in java. 
        // PQ are max-heap in C++
        // for max-heap, use comparator

        System.out.println("\nMin Heap Demo (default in java)");
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(1);
        pq.offer(99);
        pq.offer(101);

        while(!pq.isEmpty()){
            System.out.println("Removing => "+ pq.poll());
        }

        System.out.println("\n\nMax Heap Demo");
        Queue<Integer> pq2 = new PriorityQueue<>((a, b) -> b - a);
        pq2.offer(1);
        pq2.offer(99);
        pq2.offer(101);

        while(!pq2.isEmpty()){
            System.out.println("Removing => "+ pq2.poll());
        }
    }
}
