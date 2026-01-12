import java.util.*;

public class Bottom {
    public static void pushatbottom(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top=st.pop();
        pushatbottom(data, st);
        st.push(top);

    }
    public static void main(String args[]){
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        pushatbottom(4, st);

        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
    
}
