import java.util.*;
public class BBlackslexandShowering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long totalSum = 0;
            for (int i = 0; i < n - 1; i++) {
                totalSum += Math.abs(arr[i] - arr[i + 1]);
            }

            long minTime = totalSum;

            minTime = Math.min(minTime, totalSum - Math.abs(arr[0] - arr[1]));
            minTime = Math.min(minTime, totalSum - Math.abs(arr[n - 1] - arr[n - 2]));

            for (int i = 1; i < n - 1; i++) {
                long currentCost = Math.abs(arr[i] - arr[i - 1]) + Math.abs(arr[i] - arr[i + 1]);
                long newCost = Math.abs(arr[i - 1] - arr[i + 1]);
                minTime = Math.min(minTime, totalSum - currentCost + newCost);
            }

            System.out.println(minTime);
        }
    }
}
