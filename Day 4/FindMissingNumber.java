import java.util.*;

class FindMissingNumber {
    public static void findMissing(int[] arr, int N) {
        int[] temp = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
        int ans = 0;
        for (int i = 0; i <= N; i++) {
            if (temp[i] == 0) {
                ans = i + 1;
                break;
            }
        }
        System.out.println("The missing number is: " + ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 6, 2};
        int n = arr.length;
        findMissing(arr, n);
    }
}
