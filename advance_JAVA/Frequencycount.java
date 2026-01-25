import java.util.*;
public class Frequencycount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        HashMap<Character,Integer> mpp=new HashMap<>();

        for(char ch:str.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }

        System.out.println(mpp);

    }
    
}
