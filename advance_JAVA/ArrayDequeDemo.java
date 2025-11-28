import java.util.*;


public class ArrayDequeDemo {
    public static void main(String args[]){
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(10);
        ad.offer(20);
        ad.offerFirst(5);
        ad.offerLast(25);
        System.out.println("ArrayDeque elements: " + ad);
        System.out.println("First element: " + ad.peekFirst());
        System.out.println("Last element: " + ad.peekLast());
        System.out.println("Removed first element: " + ad.pollFirst());
        System.out.println("Removed last element: " + ad.pollLast());
        System.out.println("ArrayDeque after removals: " + ad);

    }
    
}
