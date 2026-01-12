import java.util.*;

public class Link{
    Node head;
    private int size;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;

        }
    }

    //add-first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;

    }

    //add-last
    public void addLast(String data){
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
            return;

        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }

        currNode.next=newNode;
    }

    //print list 
    public void printList(){
        if(head==null){
            System.out.println("List is emepty");
            return ;
            
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    //deleteing first
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }


    //deletelast
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;

        }
        size--;

        if(head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastnode=head.next;

        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }

        secondlast.next=null;
    }

    //size of the linked list 
    public int getsize(){
        return size;


        
    }





    public static void main(String args[]){
        Link list=new Link();

        list.addFirst("omkar");
        list.addFirst("Patil");

        list.printList();
        list.addLast("Kishor");
        list.printList();

        list.addFirst("This is");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println("Size of the linked list: " + list.getsize());




    }
}