import java.util.*;

public class IslandLife {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int E = sc.nextInt();
        int D = sc.nextInt(); 
        
        int totalRequired = E * D;
        
        int sundays = D / 7;
        int purchaseDays = D - sundays;
        
        
        int minBoxes = (totalRequired + N - 1) / N;
        
        if (minBoxes > purchaseDays) {
            System.out.println(-1); 
        } else {
            System.out.println(minBoxes);
        }
    }
}
