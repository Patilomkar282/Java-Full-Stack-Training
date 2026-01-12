import java.util.*;

public class ListDemo{
    public static void main(String arg[]){

        LinkedList<String> list= new LinkedList<String>();

        list.addFirst("Omkar");
        list.addFirst("Patil");
        System.out.println("Linked List after adding elements at the front: " + list);
        list.addLast("Kishor");
        System.out.println("Linked List after adding element at the end: " + list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " -> ");  
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println("Linked List after removing first element: " + list);
        list.removeLast();
        System.out.println("Linked List after removing last element: " + list);

     

        

    }
}