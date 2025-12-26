import java.util.*;
public class BSkibidusandOhio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean hasPair = false;
            for (int i = 0; i + 1 < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    hasPair = true;
                    break;
                }
            }
            if (hasPair) System.out.println(1);
            else System.out.println(s.length());
        }
    }
}
