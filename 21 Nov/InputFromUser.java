import java.util.*;

public class InputFromUser {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name & age: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
    
}
