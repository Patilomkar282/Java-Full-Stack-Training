// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
     int pizza=0;
     int puff=0;
     int cold=0;
     
     Scanner sc= new Scanner(System.in);
     pizza=sc.nextInt();
     puff=sc.nextInt();
     cold=sc.nextInt();
     
     int pip=0;
     pip=100*pizza;
     int pup=0;
     pup=20 * puff;
     int coldp=0;
     coldp=10 * cold;
     
     int total=pip+pup+coldp;
     
     System.out.println("Bill Detials:");
     System.out.println("No of Pizzas: " +" "+pizza);
      System.out.println("No of puff: " +" "+puff);
       System.out.println("No of cooldrinks: " +" "+cold);
        System.out.println("Total price: " +" "+total);
       
      
      
     
      
      
    }
}