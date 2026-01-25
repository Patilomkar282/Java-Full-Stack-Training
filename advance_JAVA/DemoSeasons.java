import java.util.*;

public class DemoSeasons {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month");
        int n=sc.nextInt();

        if(n<1 || n>12){
            System.out.println("Invalid Month");
            return;
        }
        if(n>=3 && n<=5){
            System.out.println("Season : Spring");
        }
        else if(n>=6 && n<=8 ){
            System.out.println("Season : Summer");

        }
        else if(n>=9 && n<=11){
            System.out.println("Season : Autumn");
        }
        else{
            System.out.println("Season : Winter");
        }
    }
    
}
