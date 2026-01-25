import java.util.*;
public class Increament {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary");
        int sal=sc.nextInt();
        if(sal<=0){
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("Enter the rating");
        float rating=sc.nextFloat();
        if(rating<1 || rating>5){
            System.out.println("Invalid Input");
            return;
        }


        if(rating>=1 ||  rating<=3){
            sal=sal+(int)(0.1*sal);
        }else if(rating >=3.1 || rating<=4){
            sal=sal+(int)(0.25*sal);
        }else{
            sal=sal+(int)(0.30*sal);
        }


        System.out.println(sal);
    }
    
}
