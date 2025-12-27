import java.util.*;
public class AYesorYes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int yCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'Y') {
                    yCount++;
                }
            }

            if (yCount <= 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
