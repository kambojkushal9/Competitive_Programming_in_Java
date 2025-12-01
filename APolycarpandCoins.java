import java.util.*;
public class APolycarpandCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int c1 = n / 3;
            int c2 = n / 3;

            if (n % 3 == 1) {
                c1++;
            } else if (n % 3 == 2) {
                c2++;
            }

            System.out.println(c1 + " " + c2);
        }

    }
}
