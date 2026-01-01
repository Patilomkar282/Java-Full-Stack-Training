import java.util.*;


public class Word {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word : words){
            String reversed=new StringBuilder(word).reverse().toString();
            result.append(reversed).append(" ");

        }

        System.out.println(result.toString().trim());


    }
    
}
