import java.util.*;
public class ADesorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean sorted = true;
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 1; i < n; i++) if (a[i] < a[i - 1]) sorted = false;
            if (!sorted) {
                System.out.println(0);
                continue;
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int diff = a[i] - a[i - 1];
                if (diff == 0) {
                    ans = 1;
                    break;
                }
                ans = Math.min(ans, diff / 2 + 1);
            }
            System.out.println(ans);
        }
    }
}
