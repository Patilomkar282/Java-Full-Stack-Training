import java.util.*;
public class Bubble{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=n-1;i>=1;i--){
            int swaped=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=1;
                }
            }
            if(swaped==0){
                break;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}