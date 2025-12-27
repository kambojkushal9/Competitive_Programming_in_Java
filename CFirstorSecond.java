import java.util.*;
public class CFirstorSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                long[] a = new long[n + 1];
                for (int i = 1; i <= n; i++) {
                    a[i] = scanner.nextLong();
                }

                long[] S = new long[n + 1];
                for (int i = 1; i <= n; i++) {
                    S[i] = S[i - 1] + a[i];
                }

                long maxDiff = 0 - S[n - 1];
                long currentDp = 0;

                for (int i = n - 1; i >= 1; i--) {
                    long stopVal = -(S[n] - S[i]);
                    long moveVal = a[i] + S[i] + maxDiff;

                    currentDp = Math.max(stopVal, moveVal);

                    long diff = currentDp - S[i - 1];
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }

                System.out.println(currentDp);
            }
    }
}
