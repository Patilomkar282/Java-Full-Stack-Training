import java.util.*;
public class Hash{
    public static void main(String aregs[]){
        HashSet<Integer> set=new HashSet<>();
        //adding element
        set.add(10);
        set.add(20);
        set.add(30);

        //searching element

        if(set.contains(20)){
            System.out.println("20 is present in the set");

        }

        if(!set.contains(100)){
            System.out.println("100 is not present in the set");
        }

        //deleting the element from the set
        set.remove(20);
        System.out.println("Set after removing 20: " + set);

        //size
        System.out.println("Size of the set: " + set.size());

        //printing all elements
        System.out.print("Elements in the set: ");

        //iterator in  hashset
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        


    }
}