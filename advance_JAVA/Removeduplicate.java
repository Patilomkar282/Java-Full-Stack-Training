import java.util.*;

public class Removeduplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        LinkedHashSet<Character> set=new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        String result="";
        for(char ch : set){
            result += ch;
        }


        System.out.println(result);
    }
    
}
