import java.util.*;

public class CharCompression {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb=new StringBuilder();

        int count =1;
        for(int i=1;i<=s.length();i++){
            if(i<s.length() &&  s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1)).append(count);
                count=1;
                
            }
        }

        System.out.println(sb);
    }
    
}
