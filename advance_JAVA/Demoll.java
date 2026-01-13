import java.util.*;
public class Demoll {
    Node head;
    private int size;
    Demoll(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }


    }

    public void  addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }

        newnode.next=head;
        head=newnode;

    }

    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currNode=head;

        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }

    public void printll(){
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data + "-> ");
            curNode=curNode.next;

        }
        System.out.print("Null");
    }

    public void deletefirst(){
        if(head==null){
            System.out.print("List is empty");
            return;

        }
        head=head.next;
        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }

        Node secNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secNode=secNode.next;
        }

        secNode.next=null;  
    }

    //size

    public int len(){
        return size;
    }
    public static void main(String args[]){

        Demoll dl=new Demoll();
        dl.addFirst("Omkar");
        dl.addlast("Patil");
        dl.printll();

        dl.deletefirst();
        dl.printll();

        dl.deleteLast();
        dl.printll();

        int size=dl.len();
        System.out.print("Size of list"+ size);


    }
    
}
