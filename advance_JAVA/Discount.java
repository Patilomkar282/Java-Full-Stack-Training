import java.util.*;
public class Discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String Item[]=new String[n];
        int discount[]=new int[n];
        int price[]=new int[n];
        for(int i=0;i<n;i++){
            Item[i]=sc.next();
            price[i]=sc.nextInt();
            discount[i]=sc.nextInt();
        }
        float dicounted_price[]=new float[n];
        for(int i=0;i<n;i++){
            dicounted_price[i]=price[i]-(price[i]*discount[i]/100.0f);
        }
        int min = Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<n;i++){
            if(dicounted_price[i]<min){
                min=(int)dicounted_price[i];
                ans=Item[i];
            }
        }
        System.out.println(ans);

        

        ;



    }
    
}
