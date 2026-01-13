import java.util.*;


public class HashingPract {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);

        if(set.contains(2)){
            System.out.println("Value is present");
        }

        if(!set.contains(6)){
            System.out.println("set not contain the value ");
        }


        set.remove(2);
        if(!set.contains(2)){
            System.out.println("Value is deleted");
        }
        //size
        int len=set.size();
        System.out.println("Size of set: "+ len);

        //iterator in the set

        Iterator it=set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            
        }



    }
    
}
