import java.util.*;
public class ATwoElevators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long t1 = Math.abs(a - 1);
            long t2 = Math.abs(b - c) + Math.abs(c - 1);

            if (t1 < t2) sb.append(1);
            else if (t1 > t2) sb.append(2);
            else sb.append(3);

            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}
