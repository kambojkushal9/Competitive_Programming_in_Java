import java.util.*;
public class APhoenixandBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int pile1 = (1 << n);
            for (int i = 1; i < n / 2; i++) {
                pile1 += (1 << i);
            }
            int pile2 = 0;
            for (int i = n / 2; i < n; i++) {
                pile2 += (1 << i);
            }
            System.out.println(Math.abs(pile1 - pile2));
        }
    }
}
