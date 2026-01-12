import java.util.*;
public class Permuatation{

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }

        int maxper=0;
        for(String s:str){
            int count=0;
            for(char ch:s.toCharArray()){
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
                     ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                    count++;
                }
            }
            if(count>0){
                int fact=factorial(count);
                if(fact>maxper){
                    maxper=fact;
                }
            }
        }
        System.out.println(maxper);




    }
}