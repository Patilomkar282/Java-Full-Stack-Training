import java.util.*;

public class Alterring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();

        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='0' && str.charAt(i+1)=='0'){
                count++;
            }
             if(str.charAt(i)=='1' && str.charAt(i+1)=='1'){
                count++;
            }
        }

        System.out.println(count);



    }
    
}
