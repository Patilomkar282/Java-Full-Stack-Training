import java.util.*;

public class Priority{
    public static void main(String [] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Priority Queue elements: " + pq);

        System.out.println("Head element: " + pq.peek());

        System.out.println("Removed element: " + pq.poll());

        System.out.println("Priority Queue after poll: " + pq);

    }
}