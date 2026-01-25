import java.util.*;

public class ItemDiscount {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] discountAmount = new int[n];

        int minDiscount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();   
            String[] parts = input.split(",");

            names[i] = parts[0];
            int price = Integer.parseInt(parts[1]);
            int discountPercent = Integer.parseInt(parts[2]);

            discountAmount[i] = (price * discountPercent) / 100;

            if (discountAmount[i] < minDiscount) {
                minDiscount = discountAmount[i];
            }
        }

        // Print items with minimum discount
        for (int i = 0; i < n; i++) {
            if (discountAmount[i] == minDiscount) {
                System.out.println(names[i]);
            }
        }
    }
}
