import java.util.*;

public class Velocity {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int h=sc.nextInt();
        int vi=sc.nextInt();
        int vf=sc.nextInt();

        int e=0;

        e=vi/vf;
        int res=(int)(h * Math.pow(e,2));

        System.out.println(res);
    }
    
}
