import java.util.*;


public class Luckynumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        if(n<1000 || n>9999){
            System.out.println("Invalid car no ");
            return;
        }


        int sum=0;
        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }

        if(sum % 3==0 || sum % 5==0 || sum % 7==0){
            System.out.println("Lucky Number");
        }else{
             System.out.println("Sorry its not my lucky number");

        }
    }
    
}
