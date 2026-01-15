import java.util.*;

public class QueueArrayImp {
    public static class Queue{

          public static int[] arr;
            private static int size;

            Queue(int size){
                arr=new int[size];
                this.size=size;

            }

            static int rear=-1;
            static int front=-1;

            public static boolean isEmpty(){
                return rear==-1;
            }

            //enqueue operation
            public static void add(int data){
                if(rear==size-1){
                    System.out.println("Queue is full");
                    return;


                }
                rear++;
                arr[rear]=data;


            }

            public static int deleteing(){
                if(isEmpty()){
                    return -1;
                }

                int removed = arr[0];   

                for(int i = 0; i < rear; i++){
                    arr[i] = arr[i + 1];
                }

                rear--;
                return removed;
            }


            public static int First(){
                if(isEmpty()){
                    System.out.print("Queue is empty");
                    return -1;
                }
                return arr[0];
            }



    }
  
    public static void main(String args[]){

        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        while(!q.isEmpty()){
            System.out.print(q.First()+ " ");
            q.deleteing();
        }

    }
    
}
