import java.util.*;

//Normal Binary Search 
// public class BinarySearch {



//     public static int binary(int[] arr,int target){
//         int n=arr.length;
//         int low=0;
//         int high=n-1;
//         while(low<high){
//             int mid=(high+low) / 2;
//             if(target==arr[mid]){
//                 return mid;
//             }else if(target<arr[mid]){
//                 high = mid-1;
//             }else{
//                 low=mid+1;
//             }
//         }

//         return -1;
//     }
//     public static void main(String args[]){

//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         int search=sc.nextInt();

//         int ans=binary(arr,search);

//         if(ans==-1){
//             System.out.print("Element is not in the arrat");
//         }else{
//             System.out.print("Element is present");
//         }
//     }
    
// }

//Recursive implementation:
public class BinarySearch{

    public static int binary(int[] nums,int low,int high,int target){
        if(low>high){
            return -1;
        }

        while(low<high){
            int mid=(low+high)/2;

            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                binary(nums, mid+1, high, target);
            }else{
                binary(nums, low, mid-1, target);
            }
        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int low=0;
        int high=n-1;



        int ans=binary(arr,low,high,target);
        if(ans==-1){
            System.out.println("Element is not in the array");
        }
        else{
            System.out.println("Element is present in the array");
        }

    }
}
