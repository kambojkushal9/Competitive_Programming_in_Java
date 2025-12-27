import java.util.*;
public class AStoneGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int minPos = 0, maxPos = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 1) minPos = i;
                if (a[i] == n) maxPos = i;
            }

            int left = Math.min(minPos, maxPos);
            int right = Math.max(minPos, maxPos);

            int option1 = right + 1;
            int option2 = n - left;
            int option3 = left + 1 + (n - right);

            System.out.println(Math.min(option1, Math.min(option2, option3)));
        }
    }
}
