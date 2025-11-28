import java.util.*;

public class Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tickets:");
        int tickets = sc.nextInt();

        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        System.out.print("Do you want refreshments (Y/N):");
        char refresh = Character.toLowerCase(sc.next().charAt(0));

        System.out.print("Do you have coupon code (Y/N):");
        char coupon = Character.toLowerCase(sc.next().charAt(0));

        System.out.print("Enter the circle (k/q):");
        char circle = Character.toLowerCase(sc.next().charAt(0));

        double totalcost = 0;

        if (circle == 'k') {
            totalcost = tickets * 75;
        } else if (circle == 'q') {
            totalcost = tickets * 150;
        } else {
            System.out.println("Invalid Input");
            return;
        }

        // Discount for bulk tickets
        if (tickets > 20) {
            totalcost -= totalcost * 0.10;
        }

        // Coupon discount
        if (coupon == 'y') {
            totalcost -= totalcost * 0.02;
        }

        // Refreshment addition
        if (refresh == 'y') {
            totalcost += tickets * 50;
        }

        System.out.printf("Total cost: %.2f", totalcost);
    }
}
