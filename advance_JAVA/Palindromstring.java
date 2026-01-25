import java.util.*;

public class Palindromstring {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse + str.charAt(i);

        }
       
        if(str.equals(reverse)){
            System.out.print("Palindrome");

        }else{
            System.out.print(" not Palindrome");
        }
    }
    
}
