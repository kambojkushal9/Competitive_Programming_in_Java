import java.util.*;
public class AFibonacciness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();

            int count1 = 0;
            int a3_1 = a1 + a2;
            if (a3_1 == a1 + a2) count1++;
            if (a4 == a2 + a3_1) count1++;
            if (a5 == a3_1 + a4) count1++;

            int count2 = 0;
            int a3_2 = a4 - a2;
            if (a3_2 == a1 + a2) count2++;
            if (a4 == a2 + a3_2) count2++;
            if (a5 == a3_2 + a4) count2++;

            int count3 = 0;
            int a3_3 = a5 - a4;
            if (a3_3 == a1 + a2) count3++;
            if (a4 == a2 + a3_3) count3++;
            if (a5 == a3_3 + a4) count3++;

            int ans = Math.max(count1, Math.max(count2, count3));
            System.out.println(ans);
        }
    }
}
