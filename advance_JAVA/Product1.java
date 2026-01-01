import java.util.*;

public class Product1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            int product = Math.abs(arr[i] * arr1[i]);  
            while(product > 0){
                sum += product % 10;  
                product /= 10;
            }
        }

        System.out.println(sum);
    }
}
