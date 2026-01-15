import java.util.*;
import java.lang.*;

public class Height {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();      // initial height
        int V = sc.nextInt();      // initial velocity
        int Vn = sc.nextInt();     // final velocity

 
        double e = (double)V / Vn;
        
  
        
       
        double reboundHeight = H * Math.pow(e, 2.0);
        
        System.out.println((int)reboundHeight);
    }
}