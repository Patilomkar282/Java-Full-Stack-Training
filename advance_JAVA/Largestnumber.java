import java.util.*;

public class Largestnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int larger=0;
        for(int i=0;i<n;i++){
            if(arr[i]>larger){
                larger=arr[i];   
            }
        }

        System.out.println("Largest no is: "+ larger);



    }
    
}
