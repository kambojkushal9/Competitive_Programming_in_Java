import java.util.*;
public class AInsertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char d = sc.next().charAt(0);
            String s = sc.next();

            StringBuilder res = new StringBuilder();
            boolean inserted = false;

            for (int i = 0; i < s.length(); i++) {
                if (!inserted && d > s.charAt(i)) {
                    res.append(d);
                    inserted = true;
                }
                res.append(s.charAt(i));
            }

            if (!inserted) {
                res.append(d);
            }

            System.out.println(res.toString());
        }
    }
}
