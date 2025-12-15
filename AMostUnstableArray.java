import java.util.*;
public class AMostUnstableArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            if (n == 1) sb.append(0);
            else if (n == 2) sb.append(m);
            else sb.append(2 * m);
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
