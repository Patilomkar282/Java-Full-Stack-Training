import java.util.*;

public class UpperBound {
    public static int upper(int[] nums,int key){
        int low=0;
        int high=nums.length-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]>key){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;;
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

        System.out.println("Upper Bound is"+ upper(arr,key));

    }
    
}
