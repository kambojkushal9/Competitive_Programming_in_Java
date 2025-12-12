import java.util.*;
public class AOnlyPluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] x = new int[3];
            x[0] = sc.nextInt();
            x[1] = sc.nextInt();
            x[2] = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                Arrays.sort(x);
                x[0]++;
            }
            long res = 1L * x[0] * x[1] * x[2];
            System.out.println(res);
        }
    }
}
