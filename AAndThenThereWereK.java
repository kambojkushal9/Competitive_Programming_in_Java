import java.util.*;
public class AAndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            int msb = Integer.highestOneBit(n);
            System.out.println(msb - 1);
        }
    }
}
