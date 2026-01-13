import java.util.*;

public class Stackll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static class Stack{
        Node head;
        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

            
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(32);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
