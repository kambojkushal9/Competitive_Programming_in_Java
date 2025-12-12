import java.util.*;
public class ASquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Set<Integer> xs = new HashSet<>();
            Set<Integer> ys = new HashSet<>();
            for(int i = 0; i < 4; i++){
                xs.add(sc.nextInt());
                ys.add(sc.nextInt());
            }
            Integer[] X = xs.toArray(new Integer[0]);
            Integer[] Y = ys.toArray(new Integer[0]);
            int side = Math.abs(X[0] - X[1]);
            if (side == 0) side = Math.abs(Y[0] - Y[1]);
            System.out.println(side * side);
        }
    }
}
