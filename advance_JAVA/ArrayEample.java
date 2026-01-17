import java.util.*;
import java.util.Collection;


public class ArrayEample {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(60);

        System.out.println(arr);

        //access
        int ele=arr.get(1);
        System.out.println(ele);

        //adding in between 
        arr.add(1,50);
        System.out.println(arr);

        //modifying 
        arr.set(2,49);
        System.out.println(arr);

        //delete 
        arr.remove(2);
        System.out.println(arr);

        //size
        int data = arr.size();
        System.out.println("Size of list:" + data);

        //looping 
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+ "->");

        }
        System.out.print("null");

        //sorting 

        Collections.sort(arr);
        System.out.print(arr);


    }
    
}
