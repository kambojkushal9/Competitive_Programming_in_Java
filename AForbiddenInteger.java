import java.util.*;
public class AForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if (k == 1 && x == 1) {
                out.append("NO\n");
                continue;
            }

            List<Integer> res = new ArrayList<>();

            if (x != 1) {
                for (int i = 0; i < n; i++) res.add(1);
            } else {
                if (k == 1) {
                    out.append("NO\n");
                    continue;
                }
                if (n % 2 == 1 && k == 2) {
                    out.append("NO\n");
                    continue;
                }
                if (n % 2 == 0) {
                    for (int i = 0; i < n / 2; i++) res.add(2);
                } else {
                    res.add(3);
                    for (int i = 0; i < (n - 3) / 2; i++) res.add(2);
                }
            }

            out.append("YES\n");
            out.append(res.size()).append('\n');
            for (int i = 0; i < res.size(); i++) {
                if (i > 0) out.append(' ');
                out.append(res.get(i));
            }
            out.append('\n');
        }

        System.out.print(out.toString());
    }
}
