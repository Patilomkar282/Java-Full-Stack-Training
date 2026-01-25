import java.util.*;


public class Ticket {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of tickets:");
        int tickets=sc.nextInt();
        if(tickets<5 || tickets>40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
         System.out.print("Do you have refreshments(y/n):");
        char ref=sc.next().charAt(0);
         System.out.print("Do you have coupon (y/n):");
        char cop=sc.next().charAt(0);
         System.out.print("Enter the circle:");
        char cir=sc.next().charAt(0);
        float total=0;
        if(cir !='k' && cir!='q'){
            System.out.println("Invalid Input");
            return;

        }else if(cir=='k'){
            total=75*tickets;
            if(tickets>20){
                total=(float)(total - (0.1 * total));
                if(cop=='y' || cop=='Y'){
                    total=(float) ( total - (0.02 * total));
                    if(ref=='y' || ref=='Y'){
                        total=(float) (total+ (tickets * 50));
                    }

                }
            }
        }else{
             total=150*tickets;
            if(tickets>20){
                total=(float)(total - (0.1 * total));
                if(cop=='y' || cop=='Y'){
                    total=(float) ( total - (0.02 * total));
                    if(ref=='y' || ref=='Y'){
                        total=(float) (total+ (tickets * 50));
                    }

                }
            }

        }

        System.out.println("Ticket Cost:"+ total);
        

    }
    
}
