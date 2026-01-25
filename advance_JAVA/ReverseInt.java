import java.util.*;


public class ReverseInt {

    public static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev * 10 + (n%10);
            n=n/10;
        }

        return rev;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid input");
            return;
        }
        int original=n;

        int ans=reverse(n);
        if(ans==original){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not a Palindrome");
        }
    }
    
}
