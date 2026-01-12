import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProduct = -1;
        int first = -1, second = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == 18) {
                    int a = Math.max(arr[i], arr[j]);
                    int b = Math.min(arr[i], arr[j]);

                    if (a > b) {
                        int product = a * b;
                        if (product > maxProduct) {
                            maxProduct = product;
                            first = a;
                            second = b;
                        }
                    }
                }
            }
        }

        if (maxProduct == -1) {
            System.out.println("-1");
        } else {
            System.out.println(first + " " + second);
        }
    }
}
