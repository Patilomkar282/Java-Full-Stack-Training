import java.util.*;


public class Product {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //prefix cal 
        int res[]=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*arr[i-1];
        }

        //suffix cal
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*suffix;
            suffix=suffix*arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
    
}
