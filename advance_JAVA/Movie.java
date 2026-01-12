import java.util.*;
public class Movie{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int pizza=sc.nextInt();
        int puff=sc.nextInt();
        int cooldrink=sc.nextInt();

        int total=pizza*100 + puff*20 + cooldrink*10;

        System.out.println("Bill Details");
        System.out.println(" No of Pizza bought : "+pizza);
        System.out.println(" No of Puff bought : "+puff);
        System.out.println(" No of Cooldrink bought : "+cooldrink);

        System.out.println("Total Bill Amount : "+total);

        System.out.println("Thank you, visit again!");



    }
}