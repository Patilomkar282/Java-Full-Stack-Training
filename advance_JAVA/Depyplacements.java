import java.util.*;


public class Depyplacements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int cse=sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int ece=sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int mech=sc.nextInt();

        if(cse<0 || ece<0 || mech<0){
            System.out.println("Input is Invalid");
        }

        if(cse==ece && ece==mech && mech==cse ){
            System.out.println("All Department got same placements");
        }
        else if (cse == ece && cse > mech){
                System.out.println("Highest Placement");
                System.out.println ("CSE");
                System.out.println ("ECE");
                }
                else if (cse == mech && cse > ece){
                System.out.println("Highest Placement");
                System.out.println ("CSE");
                System.out.println ("MECH");
                }
                else if (ece == mech && ece > cse) {
              System.out.println("Highest Placement");
                System.out.println ("ECE");
                System.out.println ("MECH");
        }

        else if(cse>ece && cse>mech){
            System.out.println("Highest Placement");
            System.out.print("CSE");

        }else if(ece > cse && ece>mech){
            System.out.println("Highest Placement");
             System.out.print("ECE");

        }else{
            System.out.println("Highest Placement");
             System.out.print("MECH");
        }

    }
    
}
