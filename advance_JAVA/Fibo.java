import java.util.*;

public class Fibo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mod = 47;
        
        if (n == 0 || n == 1) {
            System.out.println(1 % mod);
            return;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = ( (dp[i-1] * dp[i-1]) % mod + (dp[i-2] * dp[i-2]) % mod ) % mod;
        }

        System.out.println(dp[n]);
    }
}
