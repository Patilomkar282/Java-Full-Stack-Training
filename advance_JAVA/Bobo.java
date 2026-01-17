import java.util.*;
public class Bobo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }

        int money=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(prices[i]%5==0){
                count++;

            }
            else{
                if(money>prices[i]){
                    count++;
                    money=money-prices[i];
                }
            }
        }

        System.out.println(count);
    }
    
}
