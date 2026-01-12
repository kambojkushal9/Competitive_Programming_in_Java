import java.util.*;
public class ASashaandtheBeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            Arrays.sort(a);
            long beauty = 0;
            for (int i = 1; i < n; i++) {
                beauty += a[i] - a[i - 1];
            }
            System.out.println(beauty);
        }
    }
}
