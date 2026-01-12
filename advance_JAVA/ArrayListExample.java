import java.util.*;

public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //adding element 
        list.add(10);
        list.add(20);
        list.add(30);

       //acccessing element 
       int element=list.get(0);
         System.out.println("Element at index 0: " + element);

         //adding in between 
         list.add(1,15);
            System.out.println("After adding 15 at index 1: " + list);

        //set element 
        list .set(3,50);
        System.out.println("After setting index 3 to 50: " + list);

        //delete element in arraylist
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);

        //size of the list 
        int size=list.size();
        System.out.println("Size of the list: " + size);

        //looping on the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();


        //sorting the arraylist

        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        

    }    
}