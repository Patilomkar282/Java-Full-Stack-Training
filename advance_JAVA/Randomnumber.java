import java.util.*;

public class Randomnumber {
    public static void main(String args[]){
       Random random=new Random();

       int number=random.nextInt(0,2000);

       System.out.println(number);
        
    }
}
