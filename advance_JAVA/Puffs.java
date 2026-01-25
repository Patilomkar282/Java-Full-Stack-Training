import java.util.*;


public class Puffs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of the pizza : ");
        int pzz=sc.nextInt();
         System.out.print("Enter the no of the Puffs : ");
        int puff=sc.nextInt();
         System.out.print("Enter the no of the Cold Drinks : ");
        int cold=sc.nextInt();

        int totalprice=(pzz*100) + (puff * 20) + (cold * 10);
        
        System.out.println("No of Pizzas bought:" + pzz);
        System.out.println("No of Puffs bought:" + puff);
        System.out.println("No of Cold Drinks bought:" + cold);
        System.out.println("Total Price :" + totalprice);
        System.out.println("ENJOY THE SHOW!!!");

    }
    
}
