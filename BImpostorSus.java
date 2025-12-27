import java.util.*;
public class BImpostorSus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                String r = scanner.next();
                int n = r.length();

                for (int i = 0; i < n; i++) {
                    char c = r.charAt(i);
                    assert c == 's' || c == 'u';
                }

                int[] dp = new int[n];
                dp[0] = (r.charAt(0) == 'u') ? 1 : 0;
                dp[1] = dp[0] + ((r.charAt(1) == 'u') ? 1 : 0);

                for (int i = 2; i < n; i++) {
                    dp[i] = Math.min(dp[i - 1], dp[i - 2]) + ((r.charAt(i) == 'u') ? 1 : 0);
                }

                System.out.println(dp[n - 1]);
            }
    }
}
