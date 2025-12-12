import java.util.*;
public class AUnitedWeStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);

            if (a[0] == a[n - 1]) {
                System.out.println("-1");
            } else {
                ArrayList<Integer> b = new ArrayList<>();
                ArrayList<Integer> c = new ArrayList<>();
                int maxVal = a[n - 1];

                for (int val : a) {
                    if (val == maxVal) {
                        c.add(val);
                    } else {
                        b.add(val);
                    }
                }

                System.out.println(b.size() + " " + c.size());
                for (int i = 0; i < b.size(); i++) {
                    System.out.print(b.get(i) + (i == b.size() - 1 ? "" : " "));
                }
                System.out.println();
                for (int i = 0; i < c.size(); i++) {
                    System.out.print(c.get(i) + (i == c.size() - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}
