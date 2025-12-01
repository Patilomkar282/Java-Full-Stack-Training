import java.util.*;

public class Permutations {
    
    // Factorial function
    static long factorial(int n) {
        if(n <= 1) return 1;
        long fact = 1;
        for(int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        long maxPerm = 0;

        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            // Remove vowels
            for(int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if("aeiouAEIOU".indexOf(ch) == -1) {
                    sb.append(ch);
                }
            }

            int length = sb.length(); // count of consonants
            long permValue = (length > 0) ? factorial(length) : 0;

            maxPerm = Math.max(maxPerm, permValue);
        }

        System.out.println(maxPerm);
    }
}
