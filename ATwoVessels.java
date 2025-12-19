import java.util.*;
public class ATwoVessels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = Math.abs(a - b);
            if (diff == 0) {
                sb.append(0).append('\n');
            } else {
                int moves = (diff + 2 * c - 1) / (2 * c);
                sb.append(moves).append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}
