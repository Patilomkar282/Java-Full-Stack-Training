import java.util.*;

public class NonRepeat {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
     String s=sc.next();
     Map<Character,Integer> mpp= new LinkedHashMap<>();
     for(char ch:s.toCharArray()){
        mpp.put(ch,mpp.getOrDefault(ch,0)+1);

     }
     char res='\0';
     for(Map.Entry<Character,Integer> entry: mpp.entrySet()){
         if(entry.getValue() == 1) {
                res= entry.getKey();
                break;
            }
     }  
     
     System.out.println(res);
       


    }
    
}
