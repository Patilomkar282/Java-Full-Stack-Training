import java.util.*;


public class StackCollection {
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("Stack: " + st);

        while(!st.isEmpty()){
            System.out.println("Top element is: " + st.peek());
            System.out.println("Popped element is: " + st.pop());
        }

    }
    
}
