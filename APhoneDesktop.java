import java.util.*;
public class APhoneDesktop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int screens = y / 2 + (y % 2);
            int remainingCells = screens * 15 - y * 4;

            if (x > remainingCells) {
                x -= remainingCells;
                screens += (x + 14) / 15;
            }

            System.out.println(screens);
        }
    }
}
