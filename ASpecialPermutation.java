import java.util.*;
public class ASpecialPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println("2 1");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 2; i <= n; i++) sb.append(i).append(" ");
                sb.append(1);
                System.out.println(sb.toString());
            }
        }
    }
}
