
import java.util.Scanner;

public class ReversAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineSplit = line.split("\\s+");


        for (int i = 0; i < lineSplit.length / 2 ; i++) {
            String oldElement = lineSplit[i];
            lineSplit[i] = lineSplit[lineSplit.length - 1 - i];
            lineSplit[lineSplit.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", lineSplit));
    }
}
