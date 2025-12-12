import java.util.*;
public class ADoremysPaint3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            Map<Integer, Integer> counts = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                counts.put(val, counts.getOrDefault(val, 0) + 1);
            }

            if (counts.size() > 2) {
                System.out.println("No");
            } else if (counts.size() == 1) {
                System.out.println("Yes");
            } else {
                int count1 = counts.values().iterator().next();
                int count2 = n - count1;
                if (Math.abs(count1 - count2) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
