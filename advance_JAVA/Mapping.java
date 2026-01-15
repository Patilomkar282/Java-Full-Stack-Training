import java.util.*;


public class Mapping {
    public static void main(String args[]){
        HashMap<String,Integer> mpp=new HashMap<>();
        mpp.put("India",120);
           mpp.put("chine",180);
              mpp.put("USA",30);
        System.out.println(mpp);

        //searching

        if(mpp.containsKey("India")){
            System.out.println("key is present");
        }else{
            System.out.println("Key is not present");
        }

        //accessing  get function
        System.out.println(mpp.get("India"));
        System.out.println(mpp.get("Brazil"));

        //Iteration in the map

        for(Map.Entry<String,Integer> e:mpp.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());

        }

        //other way of iteration
        Set<String> keys=mpp.keySet();
        for(String key:keys){
            System.out.println(key+ " " +mpp.get(key));

        }

        //removing 
        mpp.remove("India");
        System.out.println(mpp);

    }
    
}
