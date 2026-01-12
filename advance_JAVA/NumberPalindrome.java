import java.util.*;
public class NumberPalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int originalNumber=number;
        int reversedNumber=0;
        if(number<0){
            System.out.println("Invalid Input");
            return;
        }

        while(number != 0){
            int dgit=number % 10;
            reversedNumber=reversedNumber*10 + dgit;
            number=number / 10;
        }

        if(originalNumber==reversedNumber){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }

    }
}