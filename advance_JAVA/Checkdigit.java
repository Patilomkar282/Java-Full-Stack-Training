import java.util.*;


public class Checkdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        boolean isdigit=true;
        for(char ch:str.toCharArray()){
            if(ch<'0' || ch>'9'){
                isdigit=false;
                break;
            }
        }

        System.out.println(isdigit ? "Only digits" : "Not only digits");
    }
    
}
