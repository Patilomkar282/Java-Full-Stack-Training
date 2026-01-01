import java.util.*;

public class Rearrange{
    public static int[] rearrangeByParity(int[] arr, int n) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Separate even and odd numbers while preserving order
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        // Combine into result array
        int[] result = new int[n];
        int idx = 0;

        for(int num : even) {
            result[idx++] = num;
        }
        for(int num : odd) {
            result[idx++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = rearrangeByParity(arr, n);

        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
