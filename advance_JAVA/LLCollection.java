import java.util.*;

public class LLCollection {
    public static void main(String args[]){
        LinkedList<String> ls=new LinkedList<>();
        ls.addFirst("Omkar");
        ls.addFirst("PAtil");
        ls.addFirst("am");
        ls.addFirst("I");

        System.out.println(ls);

        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + "->");
        }
        System.out.println("null");

        ls.remove(1);
          System.out.println(ls);

          ls.removeFirst();
            System.out.println(ls);
        
            ls.removeLast();
            System.out.println(ls);


    }
    
}
