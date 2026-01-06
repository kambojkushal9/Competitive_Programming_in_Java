import java.util.*;
public class BNoCasinointheMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int i = 0, ans = 0;
            while (i + k <= n) {
                boolean ok = true;
                for (int j = i; j < i + k; j++) {
                    if (a[j] == 1) {
                        ok = false;
                        i = j + 1;
                        break;
                    }
                }
                if (ok) {
                    ans++;
                    i += k + 1;
                }
            }
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}
