import java.util.*;

public class Rythm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }

        String res="No Words";
        int max=0;
        int ind=-1;
       for(String s : arr){
        int current=0;
        
        int sl = s.length() -1;
         for(int i=str.length()-1; i>=0 ; i--){

            if(s.charAt(sl)==str.charAt(i)){
                current++;
                if(current>max){
                    max=current;
                   res=s;
                   
                }
            }
            else{
                break;
            }
            sl--;
        }
       }
       if(ind!=-1){
        res=arr[ind];
        System.out.println(res);
       }
       else{
        System.out.println(res);
       }

    }
    
}
