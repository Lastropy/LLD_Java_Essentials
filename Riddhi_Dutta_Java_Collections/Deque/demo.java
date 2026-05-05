package LLD_Java_Essentials.Riddhi_Dutta_Java_Collections.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class demo {
    public static void main(String[] args) {
        // // All do same thing; offer doesn't throw error and returns null, hence preferred.
        // q.add(1);
        // q.push(1); // same as add()
        // q.offer(1);

        // // Both do same thing; but poll doesn't throw error if ele not present, instead returns null
        // q.remove(1);
        // q.pop(); // same as remove()
        // q.poll(1);

        // // Both do same thing; peek doesn't throw error incase queue is empty
        // q.peek();
        // q.element();

        // To use stacks -> Stack
        // To use queue -> LinkedList
        // To use Deque -> ArrayDeque

        // FIFO Dequeue demo 
        System.out.println("\n(FIFO) Deque demo");
        
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerLast(5);

        System.out.println("First ele = "+dq.peekFirst());
        System.out.println("Last ele = "+dq.peekLast());

        System.out.println("removing from front = "+dq.pollFirst());
        System.out.println("removing from back = "+dq.pollLast());

        while(!dq.isEmpty()) {
            System.out.println("Ele -> "+dq.pollFirst());
        }
    }
}
