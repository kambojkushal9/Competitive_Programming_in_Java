import java.util.*;

public class AMinimalCoprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long ans;
            if (l == 1) {
                if (r == 1) ans = 1;
                else ans = r - 1;
            } else {
                ans = r - l;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
