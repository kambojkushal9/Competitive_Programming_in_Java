import java.util.Scanner;

public class ANightattheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char current = 'a';
        int totalRotations = 0;

        for (char ch : input.toCharArray()) {
            int diff = Math.abs(ch - current);
            int steps = Math.min(diff, 26 - diff);
            totalRotations += steps;
            current = ch;
        }

        System.out.println(totalRotations);
    }
}
