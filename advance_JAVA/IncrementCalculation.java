import java.util.*;

public class IncrementCalculation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary:");
        int n=sc.nextInt();
        if(n<=0 ){
            System.out.print("Invalid Input");
            return;
        }
        System.out.println("Enter the Rating:");
        double rating=sc.nextDouble();
        if(rating<1 || rating>5){
            System.out.print("Invalid Input");
            return;
        }

        if(rating>=4.1 && rating<=5.0){
            n=n+(int)(n*0.3);
            
        }
        else if(rating>=3.1 && rating<=4.0){
             n=n+(int)(n*0.25);
        }
        else if(rating>=1.0 && rating<=3.0){
            n=n+(int)(n*0.1);
        }
        else{
            System.out.print("No Increment");
        }

        System.out.println(n);



       
    }
    
}
