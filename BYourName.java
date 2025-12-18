import java.util.*;
public class BYourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();

            int[] freq = new int[26];
            for (int i = 0; i < n; i++) freq[s.charAt(i) - 'a']++;
            for (int i = 0; i < n; i++) freq[t.charAt(i) - 'a']--;

            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    ok = false;
                    break;
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
