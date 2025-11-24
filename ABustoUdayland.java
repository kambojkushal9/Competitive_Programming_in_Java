import java.util.*;

public class ABustoUdayland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<String> busLayout = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            busLayout.add(sc.nextLine());
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            String row = busLayout.get(i);
            if (row.charAt(0) == 'O' && row.charAt(1) == 'O') {
                busLayout.set(i, "++|" + row.substring(3));
                found = true;
                break;
            }
            if (row.charAt(3) == 'O' && row.charAt(4) == 'O') {
                busLayout.set(i, row.substring(0, 3) + "++");
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
            for (String s : busLayout) System.out.println(s);
        } else {
            System.out.println("NO");
        }
    }
}
