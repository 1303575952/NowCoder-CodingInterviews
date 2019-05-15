package no7_fibonacci;

public class Solution2 {
    public int Fibonacci(int n) {
        int[] arr = new int[39 + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().Fibonacci(39));
    }
}