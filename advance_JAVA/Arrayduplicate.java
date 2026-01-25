import java.util.*;


public class Arrayduplicate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> mpp=new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        System.out.println("Duplicate element is");
        for(int p:mpp.keySet()){
            if(mpp.get(p)>=2){
                System.out.println(p + " is duplicate element in array and occurs for " + mpp.get(p) + " times" );

            }
        }

    }
    
}
