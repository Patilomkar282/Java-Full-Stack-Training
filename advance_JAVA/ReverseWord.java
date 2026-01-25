import java.util.*;


public class ReverseWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");

        for(String word : words){
            System.out.println(new StringBuilder(word).reverse().toString());
        }
    }
    
}
