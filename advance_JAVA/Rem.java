import java.util.*;

import java.lang.Math;

// public class NonRe{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();

//         int maxlen=0;

//         for(int i=0;i<s.length();i++){
//             int[] hash=new int[256];
//             for(int j=i;j<s.length();j++){
//                 if(hash[s.charAt(j)]==1){
//                     break;

//                 }
//                 int len=j-i+1;
//                 maxlen=Math.max(maxlen,len);
//                 hash[s.charAt(j)]=1;

//             }
//         }

//         System.out.println(maxlen);
//     }
// }


public class Rem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        HashMap<Character,Integer> mpp=new HashMap<>();

        int l=0;
        int maxlen=0;
        for(int r=0;r<s.length();r++){
            if(mpp.containsKey(s.charAt(r))){
                mpp.put(s.charAt(r), r);
            } else {
                mpp.put(s.charAt(r), r);
                maxlen=Math.max(maxlen, r-l+1);
            }
        }
        System.out.println(maxlen);
    }
}