import java.util.Scanner;

public class AABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            if (n == 1) {
                System.out.println("YES");
            } else if (n == 2 && s.charAt(0) != s.charAt(1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
