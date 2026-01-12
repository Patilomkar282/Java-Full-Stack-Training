import java.util.*;
public class Performance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the performance :");
        double performance=sc.nextDouble();
        if(performance <=3 && performance>=1){
            salary=(int)(salary + (salary*0.10));
        }else if(performance >3 && performance <=4){
            salary=(int)(salary + (salary*0.25));
        }else if(performance >4 && performance <=5){
            salary=(int)(salary + (salary*0.30));
        }else{
            System.out.println("Invalid Input");
            return;
        }

        System.out.println("The updated salary is: " + salary);

        
    }
}
