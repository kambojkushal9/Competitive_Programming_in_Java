import java.util.*;
public class AButtons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (a > b) System.out.println("First");
            else if (a < b) System.out.println("Second");
            else {
                if (c % 2 == 1) System.out.println("First");
                else System.out.println("Second");
            }
        }
    }

}
