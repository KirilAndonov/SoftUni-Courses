import java.util.Scanner;

public class VowelsSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;
        for (int symbol = 0; symbol <= text.length() - 1; symbol++) {
            char currentPosition = text.charAt(symbol);
            switch (currentPosition) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}