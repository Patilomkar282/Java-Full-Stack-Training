import java.util.*;
public class Seasons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int month=sc.nextInt();
        if(month>3 && month<6){
            System.out.println("Spring");
        }
        else if(month>5 && month<9){
            System.out.println("Summer");
        }
        else if(month>8 && month<12){
            System.out.println("Autumn");
        }
        else if(month==12 || month==1 || month==2){
            System.out.println("Winter");
        }
        else{
            System.out.println("Invalid Month");
        }

    }
}