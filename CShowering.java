import java.util.*;
public class CShowering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int s = sc.nextInt();
                int m = sc.nextInt();

                int prevEnd = 0;
                boolean canShower = false;

                for (int i = 0; i < n; i++) {
                    int l = sc.nextInt();
                    int r = sc.nextInt();

                    if (l - prevEnd >= s) {
                        canShower = true;
                    }
                    prevEnd = r;
                }

                if (m - prevEnd >= s) {
                    canShower = true;
                }

                System.out.println(canShower ? "YES" : "NO");
            }
        }
    }
}
