import java.util.*;
public class Magicboard {
    public static void main(String args[]){
        int n=4;
        int arr[]=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=4;i++){
            arr[i-1]=sc.nextInt();   
        }

        for(int i=0;i<n;i++){
            char ch=(char)(arr[i]);
            System.out.println(arr[i]+"-"+ch);
        }
        
    }
    
}
