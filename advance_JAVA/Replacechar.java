import java.util.*;


public class Replacechar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";

        for(char ch:str.toCharArray()){
            if(ch==' '){
                result+='@';
                
            }else{
                result+=ch;
            }
        }

        System.out.println(result);
    }
    
}
