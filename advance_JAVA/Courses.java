import java.util.*;

public class Courses {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of courses:");
        int n=sc.nextInt();
        if(n<=0 ){
            System.out.println("Invalid Input");
            return;
        }
        String courses[]=new String[n];
        System.out.println("Enter the course names:");
        for(int i=0;i<n;i++){
            courses[i]=sc.next();
        }
        System.out.println("Enter the course to be searched:");
        String searchCourse=sc.next();
         boolean found = false;
        for(int i = 0; i < n; i++){
            if(searchCourse.equals(courses[i])){
                found = true;
                break; 
            }
        }
        if(found){
            System.out.println(searchCourse + " " + "course is available");

        }
        else{
            System.out.println(searchCourse + " " + "course is not available");

          
    }
}
}
