import java.util.Scanner;

public class BYetAnotherBookshelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            solve(sc, sb);
        }

        System.out.print(sb.toString());
    }

    private static void solve(Scanner sc, StringBuilder sb) {
        int n = sc.nextInt();
        int[] a = new int[n];

        int firstBook = -1;
        int lastBook = -1;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                if (firstBook == -1) firstBook = i;
                lastBook = i;
            }
        }

        if (firstBook == -1 || firstBook == lastBook) {
            sb.append("0\n");
            return;
        }

        int zeroCount = 0;
        for (int i = firstBook; i < lastBook; i++) {
            if (a[i] == 0) zeroCount++;
        }

        sb.append(zeroCount).append("\n");
    }
}
