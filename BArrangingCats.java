import java.util.*;
public class BArrangingCats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String f = sc.next();

            int extra = 0;
            int need = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && f.charAt(i) == '0') extra++;
                if (s.charAt(i) == '0' && f.charAt(i) == '1') need++;
            }

            sb.append(Math.max(extra, need)).append('\n');
        }

        System.out.print(sb.toString());
    }
}
