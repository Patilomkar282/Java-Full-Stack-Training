import java.util.*;

public class Family {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();
       Vector<Integer> res=new Vector<Integer>();
       for(int i=0;i<n;i++){
        if(x==arr[0] || x==arr[arr.length-1]){
            res.add(-1);
            break;
        }
        else if(x==arr[i]){
            res.add(2*i + 1);
            res.add(2*i + 2);
            break;

        }
       }

       
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }

        
    }
    
}
