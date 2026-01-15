import java.util.*;
public class BTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int myStrength = a[j - 1];
            boolean hasStronger = false;
            for (int val : a) {
                if (val > myStrength) {
                    hasStronger = true;
                    break;
                }
            }

            if (k == 1 && hasStronger) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
