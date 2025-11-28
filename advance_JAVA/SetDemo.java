import java.util.*;

public class SetDemo {
    public static void main(String [] args) {
        // Set<Integer> set = new HashSet<>();  //TC- O(1)
        // Set<Integer> set= new LinkedHashSet<>(); //TC - O(1)
        Set<Integer> set= new TreeSet<>(); //TC - O(log n)

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        //duplicate elements are not allowed
        set.add(20);

        System.out.println("Set elements: " + set);

        //remove method
        set.remove(30);
        System.out.println("Set after removing 30: " + set);

        //contains method
        boolean contains20 = set.contains(20);
        System.out.println("Set contains 20: " + contains20);

        //size method
        System.out.println("Size of the set: " + set.size());

        //iterating using iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }


    }
    
}
