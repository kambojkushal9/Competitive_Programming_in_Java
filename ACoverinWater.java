import java.util.*;
public class ACoverinWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();

            if (s.contains("...")) {
                System.out.println(2);
            } else {
                int emptyCount = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        emptyCount++;
                    }
                }
                System.out.println(emptyCount);
            }
        }
    }
}
