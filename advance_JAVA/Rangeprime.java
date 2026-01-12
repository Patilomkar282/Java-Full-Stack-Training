import java.util.*;
import java.lang.Math;
public class Rangeprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=0 || b<=0 || a>b){
            System.out.println("Invalid Input");
            return;
        }

        for(int num=a;num<=b;num++){
            if(num<2){
                continue;
            }

            boolean isPrime=true;
            int i=2;
            while(i<=Math.sqrt(num)){
                if(num%1==0){
                    isPrime=false;
                    break;

                }
                i++;
            }

            if(isPrime){
                System.out.println(num + " ");
            }
        }

    }
}