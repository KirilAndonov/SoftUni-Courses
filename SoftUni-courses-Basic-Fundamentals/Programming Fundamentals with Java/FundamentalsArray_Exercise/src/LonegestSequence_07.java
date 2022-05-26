import java.util.Arrays;
import java.util.Scanner;

public class LonegestSequence_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bestSequence = 0;
        int counter = 1;
        int bestNum = 0;
        int[] arrayLine = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i < arrayLine.length; i++) {
            if (arrayLine[i] == arrayLine[i - 1]) {
                counter++;
                if (counter > bestSequence) {
                    bestSequence = counter;
                    bestNum = arrayLine[i];
                }
            } else
                    counter = 1;
        }
        for (int i = 0; i < bestSequence; i++) {
            System.out.print(bestNum + " ");
        }


    }
}

