import java.util.*;
public class Distinct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        
        
        int res[]=new int[n-k+1];


        for(int i=0;i<n-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<k;j++){
                set.add(arr[i+j]);
            }

            res[i]=set.size();


        }
         System.out.println(Arrays.toString(res));

       
        
       


    }

        
    
    
}
