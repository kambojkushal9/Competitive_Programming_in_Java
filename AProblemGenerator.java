import java.util.*;
public class AProblemGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            int[] cnt = new int[7];
            for (char c : a.toCharArray()) cnt[c - 'A']++;

            int need = 0;
            for (int i = 0; i < 7; i++) {
                if (cnt[i] < m) need += m - cnt[i];
            }
            System.out.println(need);
        }
    }
}
