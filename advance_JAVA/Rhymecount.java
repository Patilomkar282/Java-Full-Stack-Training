import java.util.*;
public class Rhymecount {

    public static String findrhyme(String s, String[] arr,int n){
        int maxMatch=0;
        int bestindex=-1;

        for(int i=0;i<n;i++){
            String word=arr[i];
            int slen=s.length();
            int wlen=word.length();
            int count=0;
            int p1=slen-1;
            int p2=wlen-1;

            while(p1>=0  && p2>=0 && s.charAt(p1)==word.charAt(p2)){
                count++;
                p1--;
                p2--;

            }

            if(count==0){
                continue;
            }

            if(count==slen && count==wlen){
                continue;
            }

            if(count>maxMatch){
                maxMatch=count;
                bestindex=i;
            }

        }

        if(bestindex==-1){
            return "No Word";

        }

        return arr[bestindex];
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();

        String[] arr=new String[n];
        for(int i =0 ;i<n;i++){
            arr[i]=sc.nextLine();
        }

        System.out.println(findrhyme(s,arr,n));
    }
    
}
