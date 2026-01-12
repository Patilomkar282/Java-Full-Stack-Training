import java.util.*;
import java.lang.Math;
public class Ball{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int V=sc.nextInt();
        int Vf=sc.nextInt();

        float e=V / Vf;
        float ans= H * (float)Math.pow(e, 2);

        System.out.printf("%.2f",ans);

    }
}