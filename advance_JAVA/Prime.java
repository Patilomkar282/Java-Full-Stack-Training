import java.util.*;
public class Prime {

    static boolean isprime(int n){
        if(n <= 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start > end || start < 0 || end < 0){
            System.out.println("Invalid Input");
            return;
        }

        for(int i = start; i <= end; i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
