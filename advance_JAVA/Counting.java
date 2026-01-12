import java.util.*;
public class Counting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int len=sc.nextInt();
      char ch = sc.next().charAt(0);
      int count=0;
      System.out.println(str);
      for(int i=0;i<len;i++){
        if(str.charAt(i)==ch){
            count++;
      }
     



    }

     System.out.println(count);

}

}