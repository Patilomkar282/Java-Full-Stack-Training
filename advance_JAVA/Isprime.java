import java.util.*;


public class Isprime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean isprime=true;

        if(n<=1){
            isprime=false;
        }

        // for(int i=2;i<=n/2;i++){
        //     if(n%i==0){
        //         isprime=false;
        //         break;
        //     }
        // }

        for(int i=2;i * i <=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }

        }


        System.out.println(isprime ? "Prime " : "Not Prime");
    }
    
}
