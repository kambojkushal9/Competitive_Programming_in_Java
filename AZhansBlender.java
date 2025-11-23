import java.util.*;

public class AZhansBlender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long rate = Math.min(x, y);

            if (n <= 0) {
                System.out.println(0);
            } else {
                long time = (n + rate - 1) / rate;
                System.out.println(time);
            }
        }

        sc.close();
    }
}
