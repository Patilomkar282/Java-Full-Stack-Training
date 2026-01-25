import java.util.*;

public class Coursesdemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of courses");
        int n=sc.nextInt();
        String[] s=new String[n];
        System.out.println("Enter the courses name");
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        System.out.println("Enter the course to be searched:");

        String search=sc.next();
        boolean found=false;

        for (int i = 0; i < n; i++) {
            if (search.equals(s[i])) {
                System.out.println(search + " course is available");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Course is not available");
        }
    }
    
}
