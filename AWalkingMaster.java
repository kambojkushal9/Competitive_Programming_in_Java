import java.util.*;
public class AWalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (d < b) {
                System.out.println(-1);
                continue;
            }

            long diag = d - b;
            long xAfterDiag = a + diag;
            long leftMoves = xAfterDiag - c;

            if (leftMoves < 0) {
                System.out.println(-1);
            } else {
                System.out.println(diag + leftMoves);
            }
        }
    }
}
