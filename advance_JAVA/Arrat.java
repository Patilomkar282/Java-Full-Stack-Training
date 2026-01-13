import java.util.*;

public class Arrat{
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
         arr.add(20);
          arr.add(30);
           arr.add(40);
            arr.add(50);

            int ele=arr.get(2);

            System.out.println(ele);

            //insert in between 
            arr.add(2,100);

            //remove

            arr.remove(3);
            //size
            int s=arr.size();

            //looping 

            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i) + " -> ");

            }

            //sorting 

            Collections.sort(arr);

            System.out.println(arr);




    }

}