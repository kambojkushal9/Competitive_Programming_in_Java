import java.util.*;
public class BFairDivision {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int one = 0, two = 0;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 1) one++;
                else two++;
            }
            int sum = one + 2 * two;
            if(sum % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            int half = sum / 2;
            if(half % 2 == 1 && one == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
