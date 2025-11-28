import java.util.*;
public class Sqaure {
    public static void main(String[] args) {
        int n=10;
        int sqareno=0;
           int cubeno=0;
        for(int i=0;i*i<=n;i++){
            int  number=i*i;
           sqareno=Math.max(sqareno, number);
            int  number1=i*i*i;
            if (number1<n) 
                {
                    cubeno=Math.max(cubeno, number1);
                
            }    
    }
        System.out.println(sqareno+cubeno);
    }
}

