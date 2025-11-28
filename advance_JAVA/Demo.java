
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        //another form
        num.add(1,15);
        //another form
        List<Integer> num2=new ArrayList<>();
        num2.add(50);
        num2.add(60);
        num.addAll(num2);

        //get method
        System.out.println("Element at index 2: " + num.get(2));

        // //remove method
        // System.out.println("Removed element: " + num.remove(3));
        // //another form of remove
        // num.remove(Integer.valueOf(20));

        //clear method
        num.clear();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        //set method

        num.set(2, 35);
        num.set(3,  50);

        boolean contains30 = num.contains(30);
        System.out.println("List contains 30: " + contains30);

        // for(int i=0;i<num.size();i++){
        //     System.out.println("Element at index " + i + ": " + num.get(i));

        // }

        //using the iterator
        Iterator<Integer> it= num.iterator();
        while(it.hasNext()){
            System.out.println("Element: " + it.next());
        }





        System.out.println("Before removing elements: " + num);

        
        

    }
}