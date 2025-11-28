import java.util.*;
public class BUniqueBidAuction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }
            int winnerValue = -1;
            for (int v = 1; v <= n; v++) {
                if (freq[v] == 1) {
                    winnerValue = v;
                    break;
                }
            }
            if (winnerValue == -1) {
                System.out.println(-1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (a[i] == winnerValue) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}