import java.util.*;
public class ABlackslexandPassword
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int k = scanner.nextInt();
            int x = scanner.nextInt();
            System.out.println(k * x + 1);
        }
    }
}
