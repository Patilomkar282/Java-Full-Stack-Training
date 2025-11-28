import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of semesters:");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int subjects[] = new int[n];
        int marks[][] = new int[n][];

        // Taking number of subjects in each semester
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the number of subjects in semester " + (i + 1) + ":");
            subjects[i] = sc.nextInt();

            if(subjects[i] <= 0) {
                System.out.println("Invalid Input");
                return;
            }
        }

        // Taking marks of each subject
        for(int i = 0; i < n; i++) {
            System.out.println("Marks obtained in semester " + (i + 1) + ":");
            marks[i] = new int[subjects[i]];

            for(int j = 0; j < subjects[i]; j++) {
                marks[i][j] = sc.nextInt();

                // Mark validation
                if(marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }
            }
        }

        // Find maximum marks for each semester
        for(int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < subjects[i]; j++) {
                if(marks[i][j] > max) {
                    max = marks[i][j];
                }
            }

            System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
        }
    }
}
