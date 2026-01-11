import java.util.*;
public class APrintaPedestalCodeforceslogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int h1 = (n + 3) / 3;
            int h2 = h1 - 1;
            int h3 = n - h1 - h2;

            if (h3 >= h2) {
                h3 = h2 - 1;
                h2 = n - h1 - h3;
            }

            sb.append(h2).append(" ").append(h1).append(" ").append(h3).append("\n");
        }

        System.out.print(sb.toString());
    }
}
