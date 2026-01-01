import java.util.*;

public class Parity {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int maxlen=0;
        int currentlen=0;


        for(int i=1;i<a;i++){
            if(arr[i]%2!=arr[i-1]%2){
                currentlen++;

            }else{
                currentlen=1;
            }

            maxlen=Math.max(maxlen,currentlen);


        }

        System.out.println(maxlen);

         

    }
}
