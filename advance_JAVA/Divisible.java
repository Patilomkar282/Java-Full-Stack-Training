import java.util.*;

public class Divisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int reminder=0;
         for(int i=0;i<str.length();i++){
          reminder=(reminder*10 + (str.charAt(i)-'0'))%11;
         }
         System.out.println(reminder);
        
    }
    
}
