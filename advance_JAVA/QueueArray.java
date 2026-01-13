import java.util.*;
public class QueueArray{
    static class Queue{

    static int[] arr;
    static int front=-1;
    static int rear=-1;
    static int size;
    Queue(int size){
        arr=new int[size];
        this.size=size;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    //enquue- addition
    public static void adding(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear]=data;
    }

    //remove element 
    public static int removeq(){
        if(isEmpty()){
            System.out.println("Qeueu is empty");
            return -1;

        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }

        rear--;
        return front;


    }

    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front+1];


    }
    
   
}

 public static void main(String[] args){
        Queue q=new Queue(5);
        q.adding(1);
        q.adding(2);
        q.adding(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.removeq();
        }



    }

}