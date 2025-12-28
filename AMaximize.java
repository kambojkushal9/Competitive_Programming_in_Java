import java.util.Scanner;

public class AMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int x = sc.nextInt();
            sb.append(x - 1).append('\n');
        }
        System.out.print(sb.toString());
    }
}
