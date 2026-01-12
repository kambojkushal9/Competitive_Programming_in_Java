import java.util.*;
public class APrintaPedestalCodeforceslogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int h1, h2, h3;

            if (n % 3 == 0) {
                h1 = n / 3 + 1;
                h2 = n / 3;
                h3 = n / 3 - 1;
            } else if (n % 3 == 1) {
                h1 = n / 3 + 2;
                h2 = n / 3;
                h3 = n / 3 - 1;
            } else {
                h1 = n / 3 + 2;
                h2 = n / 3 + 1;
                h3 = n / 3 - 1;
            }

            System.out.println(h2 + " " + h1 + " " + h3);
        }
    }
}
