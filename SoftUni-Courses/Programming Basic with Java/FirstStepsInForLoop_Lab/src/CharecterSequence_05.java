import java.util.Scanner;

public class CharecterSequence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int symbol = 0; symbol <= text.length() - 1; symbol++){
            char currentPosition = text.charAt(symbol);
            System.out.println(currentPosition);
        }
    }
}
