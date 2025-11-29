import java.util.*;

public class  Stock{
    public static int bestBuyPrice(int[] changes) {
        int price = 0;
        int minPrice = 0; 

        for (int change : changes) {
            price += change;
            minPrice = Math.min(minPrice, price);
        }

        return minPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] changes = new int[N];

        for (int i = 0; i < N; i++) {
            changes[i] = sc.nextInt();
        }

        System.out.println(bestBuyPrice(changes));
        sc.close();
    }
}
