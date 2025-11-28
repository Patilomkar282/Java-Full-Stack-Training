import java.util.*;


public class Factors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();

        if(number==0){
            System.out.println("No factors for 0");
            return;
        }
        if(number<0){
            number=Math.abs(number);
        }

         int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // Create array with exact factor count
        int factors[] = new int[count];
        int index = 0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index++]=i;
            }
        }

        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+ "");
        }



    }
    
}
