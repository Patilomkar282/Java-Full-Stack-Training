import java.util.*;
public class Movies{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of ticketd:");
        int tickets=sc.nextInt();
        System.out.println("Do you have coupon(Y/N):");
        char coupon=sc.next().charAt(0);
        System.out.println("Do you want refreshment(Y/N):");
        char refreshment=sc.next().charAt(0);
        System.out.println("Enter the circle (K/Q):");
        char circle=sc.next().charAt(0);
        if(circle!='K' && circle!='Q'){
            System.out.println("Invalid Input");
            return;
        }

        if(tickets <5 || tickets >40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }

        double ticketCost=0.0;
        if(circle=='K'){
            ticketCost=75 * tickets;
            if(tickets>20){
                ticketCost= ticketCost - (0.10 * ticketCost);
                if(coupon=='Y'){
                    ticketCost=ticketCost - (0.02 * ticketCost);
                    if(refreshment=='Y'){
                    ticketCost=ticketCost + (50 * tickets);
                    }
                }
                
               
            }
        }
        else if(circle=='Q'){
            ticketCost=150 * tickets;
            if(tickets>20){
                ticketCost= ticketCost - (0.10 * ticketCost);
                if(coupon=='Y'){
                    ticketCost=ticketCost - (0.02 * ticketCost);
                    if(refreshment=='Y'){
                    ticketCost=ticketCost + (50 * tickets);
                    }
                }
                
               
            }
        }


        System.out.printf("Total Ticket Cost: %.2f",ticketCost);
    }
}