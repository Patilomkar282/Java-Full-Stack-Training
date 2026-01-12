import java.util.*;


public class LLFramework {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove();
        System.out.println(list);

        int n=list.size();

        for(int i=0;i<n;i++){
            System.out.print(list.get(i) + "-> ");
        }
        System.out.println("Size of linked list is " + n);

    }
    
}
