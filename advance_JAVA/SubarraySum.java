import java.util.*;

public class SubarraySum {
    public static int maxSpecialSubarraySum(int[] arr, int n, int k) {
        if(k <= 1 || n < 2) return 0;

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n && (j - i + 1) <= k; j++) {
                sum += arr[j];
                int length = j - i + 1;
                if(length >= 2) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum == Integer.MIN_VALUE ? 0 : maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(maxSpecialSubarraySum(arr, n, k));
    }
}
