import java.util.*;

public class Duplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch, 0) + 1);
        }

        System.out.println("The duplicate char are ");

        for(char ch : map.keySet()){
            if(map.get(ch)>1)
{
            System.out.println(ch + "= " + map.get(ch));
}        }


    }
}