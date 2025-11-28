
import java.util.HashSet;

public class CustomSet {
    public static void main(String[] args) {
        
        HashSet<Student> st=new HashSet<>();   
        st.add(new Student(1,"Omkar"));
        st.add(new Student(2,"Akash"));
        st.add(new Student(3,"Rahul"));
        st.add(new Student(3,"Rahul"));

        System.out.println("Student Set: " + st);
    
    }
}
