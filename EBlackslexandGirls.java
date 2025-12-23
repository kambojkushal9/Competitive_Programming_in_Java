import java.util.*;
public class EBlackslexandGirls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();
            String s = sc.next();

            long sumP = 0;
            long pA = 0;
            long pB = 0;
            int nA = 0;
            int nB = 0;
            int oddP = 0;

            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextLong();
                sumP += p[i];
                if (p[i] % 2 != 0) oddP++;

                if (s.charAt(i) == '0') {
                    nA++;
                    pA += p[i];
                } else {
                    nB++;
                    pB += p[i];
                }
            }

            if (sumP > x + y) {
                System.out.println("NO");
                continue;
            }

            long surplus = (x + y) - sumP;
            long diff = x - y;

            long maxDiff;
            if (nA > 0) {
                long termA = pA + surplus;
                long termB = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        termB += (p[i] % 2 != 0) ? -1 : -2;
                    }
                }
                maxDiff = termA + termB;
            } else {
                long limit = oddP + surplus;
                long c;
                if (limit < n) {
                    c = limit;
                } else {
                    c = ((limit - n) % 2 == 0) ? n : n - 1;
                }
                maxDiff = c * -1L + (n - c) * -2L;
            }

            long minDiff;
            if (nB > 0) {
                long termB = -(pB + surplus);
                long termA = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        termA += (p[i] % 2 != 0) ? 1 : 2;
                    }
                }
                minDiff = termA + termB;
            } else {
                long limit = oddP + surplus;
                long c;
                if (limit < n) {
                    c = limit;
                } else {
                    c = ((limit - n) % 2 == 0) ? n : n - 1;
                }

                minDiff = c * 1L + (n - c) * 2L;
            }

            if (diff >= minDiff && diff <= maxDiff) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
