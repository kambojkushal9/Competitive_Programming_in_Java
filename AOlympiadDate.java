import java.util.*;
public class AOlympiadDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] need = new int[10];
        need[0] = 3;
        need[1] = 1;
        need[2] = 2;
        need[3] = 1;
        need[5] = 1;

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[10];
            int answer = 0;

            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                freq[d]++;

                if (answer == 0) {
                    boolean ok = true;
                    for (int k = 0; k < 10; k++) {
                        if (freq[k] < need[k]) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) answer = i + 1;
                }
            }
            System.out.println(answer);
        }
    }
}
