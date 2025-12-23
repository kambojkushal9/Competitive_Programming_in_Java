import java.util.*;
public class CBlackslexandNumberTheory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            int diff = a[1] - a[0];
            if (diff > a[0]) {
                System.out.println(diff);
            } else {
                System.out.println(a[0]);
            }
        }
    }
}
