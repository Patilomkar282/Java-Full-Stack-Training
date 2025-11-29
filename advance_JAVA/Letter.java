import java.util.*;

public class Letter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=sc.nextInt();
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)==ch){
                count++;
            }

        }
        System.out.println(count);
    }
    
}
