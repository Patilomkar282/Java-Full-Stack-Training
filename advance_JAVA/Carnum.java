import java.util.*;
public class Carnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<1000 && number>9999){
            System.out.println("Invalid Input");
            return;
        }

        int firstdigit=number/1000;
        int seconddigit=(number/100)%10; 
        int thirddigit=(number/10)%10;   
        int lastdigit=number%10;
        int sum=firstdigit+seconddigit+thirddigit+lastdigit;
        if(sum % 3==0 || sum % 5==0 || sum % 7==0){
            System.out.println("Valid Car Number");
        }
        else{
            System.out.println("Invalid Car Number");
        }


    }
    
}
