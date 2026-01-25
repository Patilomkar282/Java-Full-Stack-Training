import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

       
        if (a <= 0 || b <= 0 || a >= b) {
            System.out.println("Provide valid input");
            return;
        }

     
        for (int i = a; i <= b; i++) {

            if (i == 1) continue; 

            int count = 0;
            int j = 1;

            
            while (j <= i) {
                if (i % j == 0) {
                    count++;
                }
                j++;
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
