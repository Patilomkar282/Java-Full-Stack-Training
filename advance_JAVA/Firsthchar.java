
import java.util.*;

public class Firsthchar {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        HashMap<Character,Integer> mapp=new HashMap<>();

        for(char ch : str.toCharArray()){
            mapp.put(ch,mapp.getOrDefault(ch,0)+ 1);
        }

        System.out.println("First occuurrnce is ");

        for(char ch : mapp.keySet()){
            if(mapp.get(ch) ==1){
                System.out.println("First ocurence is " + ch);
                break;
            }

        }


    }
}
