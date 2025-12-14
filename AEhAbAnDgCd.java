import java.util.*;
public class AEhAbAnDgCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long x = sc.nextLong();
            if (x % 2 == 0) {
                long a = x / 2;
                sb.append(a).append(" ").append(a).append("\n");
            } else {
                sb.append(1).append(" ").append(x - 1).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
