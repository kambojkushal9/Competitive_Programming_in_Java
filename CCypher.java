import java.util.*;
public class CCypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int len = sc.nextInt();
                String s = sc.next();
                for (char c : s.toCharArray()) {
                    if (c == 'U') {
                        a[i] = (a[i] - 1 + 10) % 10;
                    } else {
                        a[i] = (a[i] + 1) % 10;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
