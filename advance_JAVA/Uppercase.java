import java.util.*;

public class Uppercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result="";

        for(char ch : str.toCharArray()){
            if(ch>='a'  && ch<='z'){
                result+=(char)(ch-32);
            }
            else{
                result+=ch;
            }
        }


        System.out.println(result);
    }
    
}
