import java.util.*;


public class SearchInsert {
    public static int seachinsert(int[] nums,int key){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=key){
                ans=mid;
                high=mid-1;

            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){

        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int key=sc.nextInt();
        int ans=seachinsert(arr,key);

          System.out.println("The index is: " + ans);

    }
    
}
