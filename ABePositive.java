import java.util.*;
public class ABePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int neg = 0;
            int zero = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == -1) neg++;
                else if (x == 0) zero++;
            }
            int ops = zero;
            if (neg % 2 != 0) ops += 2;
            System.out.println(ops);
        }
    }
}
