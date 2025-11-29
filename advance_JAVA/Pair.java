import java.util.*;


public class Pair {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        List<Integer> res=new ArrayList<Integer>();
         int f =-1;
            int s=-1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int maxprod=0;
           
            for(int j=i+1;j<n;j++){
                if( arr[i] + arr[j] == 18 && arr[i] * arr[j] > maxprod){
                    maxprod=arr[i] * arr[j];
                    f = arr[i];
                    f=arr[i];
                    s=arr[j];


                
                }
                
            }

        }
         res.add(s);
        res.add(f);
       
        
        System.out.println(res);

        // for(int i=0;i<res.size();i++){
        //     System.out.print(res.get(i)+" ");
        // }
    }
    

}
