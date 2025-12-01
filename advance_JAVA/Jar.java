import java.util.*;

public class Jar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int A=0;
        for(int i=0;i<n;i++){
            A+=(arr[i]/3);

            if(arr[i] % 3>0){
                A+=1;
            }
        }

        System.out.println(A);


    }
    
}
