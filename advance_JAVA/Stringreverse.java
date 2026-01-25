import java.util.*;

public class Stringreverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse=new StringBuilder(str).reverse().toString(); //inbuilt 

        // for(int i=str.length()-1;i>=0;i--){
        //     reverse=reverse+str.charAt(i);
        // }



        System.out.println(reverse);

    }
    
}
