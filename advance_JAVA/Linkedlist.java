import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed element: " + q.poll());
        System.out.println("Front element after poll: " + q.peek());
        q.remove();
    

        System.out.println("Queue elements: " + q);



       
    }

     
}