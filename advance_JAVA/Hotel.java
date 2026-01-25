import java.util.*;
import java.lang.*;
class cook implements Runnable{
    private String task;

    cook(String task){
        this.task=task;
    }

    public void run(){
        System.out.println(task + " is cooked by "+ Thread.currentThread().getName());
    }
}

public class Hotel {
    public static void main(String args[]){
        Thread t1=new Thread(new cook("Soup"));
        Thread t2=new Thread(new cook("Pizza"));
        Thread t3=new Thread(new cook("Burger"));
        Thread t4=new Thread(new cook("chapatii"));


        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    
}
