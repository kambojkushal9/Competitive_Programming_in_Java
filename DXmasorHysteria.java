import java.util.*;
public class DXmasorHysteria {
    static class Elf implements Comparable<Elf> {
        int id;
        int val;

        public Elf(int id, int val) {
            this.id = id;
            this.val = val;
        }

        @Override
        public int compareTo(Elf other) {
            return Integer.compare(this.val, other.val);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                int m = scanner.nextInt();

                Elf[] elves = new Elf[n];
                for (int i = 0; i < n; i++) {
                    elves[i] = new Elf(i + 1, scanner.nextInt());
                }

                if (m == 0 || m > n / 2) {
                    System.out.println("-1");
                    continue;
                }

                Arrays.sort(elves);

                StringBuilder sb = new StringBuilder();
                sb.append(n - m).append('\n');

                int fodderCount = n - 2 * m;
                for (int i = 0; i < fodderCount; i++) {
                    sb.append(elves[i].id).append(" ").append(elves[i + 1].id).append('\n');
                }

                for (int i = 0; i < m; i++) {
                    sb.append(elves[n - m + i].id).append(" ").append(elves[n - 2 * m + i].id).append('\n');
                }

                System.out.print(sb);
            }
    }
}
