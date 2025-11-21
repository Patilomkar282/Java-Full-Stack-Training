// package studets;
import java.util.*;


public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        if(n>=18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }    
    }
}