import java.util.*;
public class ATurtlePuzzleRearrangeandNegate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int negAbsSum = 0;
            boolean hasNegative = false;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                if (x < 0) {
                    hasNegative = true;
                    negAbsSum += -x;
                }
            }

            if (hasNegative) {
                sum += 2 * negAbsSum;
            }

            System.out.println(sum);
        }
    }
}
