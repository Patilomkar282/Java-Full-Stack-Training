import java.util.*;

public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=sc.next();
        char a1[]=s.toCharArray();
        char a2[]=s1.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){
            System.out.println("anagram");

        }
        else{
            System.out.println("No anagram");
        }

    }
    
}

//time - O(nlogn)
//space - O(n)
