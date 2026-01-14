import java.util.*;
public class BSymmetricEncoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String b = scanner.next();

            boolean[] distinct = new boolean[26];
            for (int i = 0; i < n; i++) {
                distinct[b.charAt(i) - 'a'] = true;
            }

            StringBuilder rBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (distinct[i]) {
                    rBuilder.append((char)('a' + i));
                }
            }
            String r = rBuilder.toString();

            char[] decodeMap = new char[26];
            int len = r.length();
            for (int i = 0; i < len; i++) {
                decodeMap[r.charAt(i) - 'a'] = r.charAt(len - 1 - i);
            }

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < n; i++) {
                s.append(decodeMap[b.charAt(i) - 'a']);
            }

            System.out.println(s);
        }
    }
}
