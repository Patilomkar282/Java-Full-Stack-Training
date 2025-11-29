import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=N-1;i>=0;i--){
            if(i%2==0){
                sum=sum+arr[i];

            }

        }
        System.out.println(sum);

    }
    
}
