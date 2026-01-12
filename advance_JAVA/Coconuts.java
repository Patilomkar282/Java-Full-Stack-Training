import java.util.*;
public class Coconuts{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int D=sc.nextInt();
        int E=sc.nextInt();

        int totalreq= D * E;
        int sundays= D /7;
        int buydays= D - sundays;
        int maxSweet= buydays * N;
        if( maxSweet < totalreq){
            System.out.println(-1);
            return;
        }

        int minBuys= (totalreq + N -1)/ N;
        System.out.println(minBuys);

    }
}