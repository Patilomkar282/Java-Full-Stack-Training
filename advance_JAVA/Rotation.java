public class Rotation {
    
    public static int maxRotateSum(int[] A, int N) {
        if (N == 0) return 0;
        int arrSum = 0;   
        int currVal = 0;  
        for (int i = 0; i < N; i++) {
            arrSum += A[i];
            currVal += i * A[i];
        }
        int maxVal = currVal;
        for (int r = 1; r < N; r++) {
            currVal = currVal + arrSum - (N * A[N - r]);
            maxVal = Math.max(maxVal, currVal);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4};
        int input2 = 4;

        System.out.println(maxRotateSum(input1, input2)); // Output: 20
    }
}
