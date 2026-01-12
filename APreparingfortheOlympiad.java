import java.util.*;
public class APreparingfortheOlympiad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            int maxDiff = a[n - 1];

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > b[i + 1]) {
                    maxDiff += a[i] - b[i + 1];
                }
            }

            System.out.println(maxDiff);
        }
    }
}
