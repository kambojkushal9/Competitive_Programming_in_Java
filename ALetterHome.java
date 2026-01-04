import java.util.*;
public class ALetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int l = Integer.MAX_VALUE;
            int r = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                l = Math.min(l, x);
                r = Math.max(r, x);
            }
            int ans;
            if (s < l) ans = r - s;
            else if (s > r) ans = s - l;
            else ans = (r - l) + Math.min(s - l, r - s);
            System.out.println(ans);
        }
    }
}
