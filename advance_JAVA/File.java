import java.util.*;


public class File {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String[] arr=new String[n];
         for(int i=0;i<n;i++){
          arr[i]=sc.next();
         }
          int res=0;

         for(int i=0;i<n;i++){
           
            if(arr[i].matches("File_\\d+")){
                String[] parts = arr[i].split("_");
                int version = Integer.parseInt(parts[1]);
                
                if(version > res) {
                    res = version;
                }


            }
         }

         System.out.println(res);
    }
    
}
