import java.util.*;
public class DBlackslexandPenguinCivilization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            sb.append((1 << n) - 1).append(" ");

            for (int k = 1; k <= n; k++) {
                int limit = 1 << (k - 1);
                int base = (1 << (n - k)) - 1;
                int shift = n - k + 1;

                for (int j = 0; j < limit; j++) {
                    sb.append(base + (j << shift)).append(" ");
                }
            }
            System.out.println(sb);
        }
    }
}
