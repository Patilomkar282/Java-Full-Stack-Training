import java.util.*;



public class Indexing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int exor=0;
        int sum=0; 

        for(int i=0;i<n;i++){
            if(i%2==0){
                exor=exor ^ arr[i];

            }else{
                sum=sum+arr[i];
            }
        }


        System.out.println(sum-exor);
    }
    
}
