import java.util.*;
public class Placements{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of students placed in CSE");
        int CSE=sc.nextInt();
        System.out.println("Enter the number of students placed in ECE");
        int ECE=sc.nextInt();
        System.out.println("Enter the number of students placed in MECH");
        int MECH=sc.nextInt();
        if(CSE>=ECE && CSE>=MECH){
            System.out.println("CSE");
        }else if(ECE>=CSE && ECE>=MECH){
            System.out.println("ECE");
        }else{
            System.out.println("MECH");
        }
    }
}