import java.util.*;
public class ACasimirsStringSolitaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int countA = 0;
            int countB = 0;
            int countC = 0;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'A') {
                    countA++;
                } else if (ch == 'B') {
                    countB++;
                } else if (ch == 'C') {
                    countC++;
                }
            }

            if (countB == countA + countC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
