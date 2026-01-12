import java.util.*;

public class RhymingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int n = sc.nextInt();

        String[] D = new String[n];
        for(int i = 0; i < n; i++) {
            D[i] = sc.next();
        }

        int maxMatch = 0;
        String result = "No Word";

        for(int i = 0; i < n; i++) {
            String word = D[i];

            int p1 = S.length() - 1;
            int p2 = word.length() - 1;
            int count = 0;

            while(p1 >= 0 && p2 >= 0) {
                if(S.charAt(p1) == word.charAt(p2)) {
                    count++;
                    p1--;
                    p2--;
                } else {
                    break;
                }
            }

            // Ignore same word
            if(count == S.length() && count == word.length())
                continue;

            if(count > maxMatch) {
                maxMatch = count;
                result = word;
            }
        }

        System.out.println(result);
    }
}
