import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit = temp %10;
            sum += digit *  digit * digit ;
            temp=temp/10;

        }

        System.out.println(n==sum ? "Armstrong" : "Not armstrong");

        

    }
    
}
