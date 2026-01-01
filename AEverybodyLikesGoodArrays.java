import java.util.*;
public class AEverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            int ops = 0;
            int i = 0;
            while (i < n) {
                int j = i;
                int parity = (int) (a[i] % 2);
                while (j < n && a[j] % 2 == parity) j++;
                int len = j - i;
                if (len > 1) ops += len - 1;
                i = j;
            }
            System.out.println(ops);
        }
    }
}
