import java.util.*;
public class Casing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fname=sc.next();
        String lname=sc.next();

        System.out.println(lname.toUpperCase()+" "+fname.toLowerCase());
    }
}