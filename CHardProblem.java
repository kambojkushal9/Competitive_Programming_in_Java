import java.util.*;
public class CHardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long row1 = Math.min(m, a);
            long row2 = Math.min(m, b);

            long remainingSeats = (m - row1) + (m - row2);
            long extra = Math.min(remainingSeats, c);

            System.out.println(row1 + row2 + extra);
        }
    }
}
