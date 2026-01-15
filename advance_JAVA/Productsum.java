import java.util.*;
public class Productsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max_product=0;
        int[] res=new int[2];

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+ arr[j] == 18){
                    int temp=arr[i] * arr[j];
                    if(temp>max_product){
                        max_product=temp;
                       if(arr[i]>arr[j]){
                        res[0]=arr[i];
                        res[1]=arr[j];
                       }else{
                        res[0]=arr[j];
                        res[1]=arr[i];

                       }
                    }
                }

            }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }
    



    }
    
}
