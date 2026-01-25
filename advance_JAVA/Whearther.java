
import java.util.*;
public class Whearther {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx=0;

        int[] diff=new int[n];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int ans=arr[j]-arr[i];
                diff[idx]=ans*ans;
                 idx++;
            }

        }
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+diff[i];

        }

        System.out.println(sum);

    }
    
}
