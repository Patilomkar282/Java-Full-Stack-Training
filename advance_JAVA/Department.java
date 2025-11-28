import java.util.*;


public class Department {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of students placed in CSE:");
        int cse=sc.nextInt();
        System.out.print("Enter the number of students placed in ECE:");
        int ece=sc.nextInt();
        System.out.print("Enter the number of students placed in MECH:");
        int mech=sc.nextInt();
        

        if(cse>ece && cse>mech){
            System.out.println("Highest Placement");
            System.out.println("CSE");
        }
        else if(ece>cse && ece>mech){
            System.out.println("Highest Placement");
            System.out.println("ECE");
        }
        else if(mech>cse && mech>ece){
            System.out.println("Highest Placement");
            System.out.println("MECH");
        }
        else{
            System.out.println("None of the department has highest placement");
        }

    }
    
}
