import java.util.*;

public class Replace {
    public static int nextGreater(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i < 0) return -1;

        
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

     
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

      
        reverse(digits, i + 1, len - 1);

       
        long result = Long.parseLong(new String(digits));

      
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return -1;
        }

        return (int) result;
    }

    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nextGreater(n)); 
    }
}
