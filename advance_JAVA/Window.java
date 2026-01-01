
import java.util.*;
public class Window {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();


        int start=0;
        int currsum=0;
        boolean found=false;
        for(int end=0;end<n;end++){
            currsum+=arr[end];
        while(currsum>s && start<=end){
            currsum-=arr[start];
            start++;
        }

        if(currsum==s){
            found=true;
            break;

        }
        }


        if(found){
            System.err.println("Yes");
        }else{
            System.out.println("No");
        }
      

    }
}
