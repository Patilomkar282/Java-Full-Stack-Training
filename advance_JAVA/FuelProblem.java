import java.util.*;

public class FuelProblem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cap=sc.nextInt();
        int dist=sc.nextInt();
        //lit/100km
        float ans1 = ((float) cap / dist) * 100;


        //miles/gallons
        float miles=(float) 0.6214*dist;
        float gallons=(float) 0.2642 * cap;

        float ans2=miles/gallons;

       System.out.println("Liters/100KM");
       System.out.printf("%.2f%n", ans1);

          System.out.println("miles/gallons");
       System.out.printf("%.2f%n", ans2);


    }
    
}
