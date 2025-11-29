import java.util.*;

public class Bulb {
    public static long maxBulbs(int[] a) {
        int n = a.length;
        Deque<Integer> stack = new ArrayDeque<>();
        long maxCollected = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || a[stack.peek()] <= a[i]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                long collected = (long) a[top] * width;
                if (collected > maxCollected) maxCollected = collected;
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            long collected = (long) a[top] * width;
            if (collected > maxCollected) maxCollected = collected;
        }

        return maxCollected;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] machines = new int[number];
        for (int i = 0; i < number; i++) machines[i] = sc.nextInt();

        System.out.println(maxBulbs(machines));
    }
}
