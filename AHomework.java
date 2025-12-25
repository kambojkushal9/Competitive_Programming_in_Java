import java.util.*;
public class AHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            Deque<Character> dq = new ArrayDeque<>();
            for (char ch : a.toCharArray()) dq.addLast(ch);
            int m = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            for (int i = 0; i < m; i++) {
                if (c.charAt(i) == 'V') dq.addFirst(b.charAt(i));
                else dq.addLast(b.charAt(i));
            }
            while (!dq.isEmpty()) out.append(dq.pollFirst());
            out.append('\n');
        }
        System.out.print(out.toString());
    }
}
