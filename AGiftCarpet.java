import java.util.*;

public class AGiftCarpet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = sc.next();
            }

            char[] name = {'v', 'i', 'k', 'a'};
            int idx = 0;

            for (int col = 0; col < m && idx < 4; col++) {
                boolean found = false;
                for (int row = 0; row < n; row++) {
                    if (grid[row].charAt(col) == name[idx]) {
                        found = true;
                        break;
                    }
                }
                if (found) idx++;
            }

            if (idx == 4) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
