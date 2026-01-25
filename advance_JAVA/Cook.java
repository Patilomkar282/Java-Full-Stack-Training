import java.util.*;
import java.lang.*;
class Demo extends Thread{
    private String task;
    Demo(String task){
        this.task=task;
    }

    public void run(){
        System.out.println(task + "is cooked by " + Thread.currentThread().getName());
    }
}

public class Cook{
    public static void main(String args[]){
        Thread t1=new Demo("Pasta");
        Thread t2=new Demo("Roti");
        Thread t3=new Demo("Pizza");

        t1.start();
        t2.start();
        t3.start();


    }
}



