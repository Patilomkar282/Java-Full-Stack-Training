import java.util.*;


public class Luckyno {

    public static int calculatelucky(int n,String lucky){
       int luckyNo=0;
       for(int i=0;i<n;i++){
        int index=1;
        int ascii=(int)lucky.charAt(i);
        if(index % 2==1 || ascii % 2==1){
            luckyNo=luckyNo + (index * ascii);
       }

      
    }
     return luckyNo;
}
    
    public static void main(String args[]){
        int n=12;
        String lucky="";
        Scanner sc=new Scanner(System.in);
        lucky=sc.nextLine();
        int ans=calculatelucky(n,lucky);
        System.out.println(ans);
    }
}
