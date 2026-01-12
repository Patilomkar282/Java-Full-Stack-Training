import java.util.*;

public class LLPracti{
    static Node  head;
    private static int size;


    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public static boolean isEmpty(){
        return head==null;
    }

    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;  
    }

    public static void addLast(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            head=newnode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newnode;
        newnode.next=null;

    }

    //printing the list 
    public static void printll(){
        if(isEmpty()){
            System.out.print("The list is empty");
            return;
        }

        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }  
        System.out.print("null");

    }

    //deleete first 

    public static void deletefirst(){
        if(isEmpty()){
            System.out.print("Entire list is empty");
            return;
        }

        head=head.next;
        size--;
    }

    public static void deletelast(){
        if(isEmpty()){
            System.out.print("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;

        while(currNode.next.next!=null){
            currNode=currNode.next;
        }   
        currNode.next=null;
      
    }

    //size of linked list
    public static int getsize(){
        return size;
    }





    public static void main(String args[]){
        LLPracti ll=new LLPracti();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        ll.printll();
        System.out.println();
        System.out.println("Size of linked list is: " + ll.getsize());
        ll.deletefirst();
        ll.printll();
        System.out.println();
        System.out.println("Size of linked list is: " + ll.getsize());
        ll.deletelast();
        ll.printll();
        System.out.println();
        System.out.println("Size of linked list is: " + ll.getsize());
    
    }
}
