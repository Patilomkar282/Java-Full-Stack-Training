import java.util.*;
public class Zero{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=String.valueOf(n);

        str=str.replace('0','5');
       int ans = Integer.parseInt(str);
       System.out.println(ans);
    }
}