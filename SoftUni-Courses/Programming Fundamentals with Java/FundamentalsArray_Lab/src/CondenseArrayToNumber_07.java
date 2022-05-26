import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   String line = scanner.nextLine();
        String[] numbersAsStrings = line.split("\\s+");
        int[] numbers = new int[numbersAsStrings.length];
        while ( numbersAsStrings.length > 0){
        int[] condensed = new int[numbersAsStrings.length - 1];
            for (int i = 0; i < numbersAsStrings.length - 1 ; i++) {
             condensed[i] = numbers[i] + numbers[i +1];
            }
        numbers = condensed;
             numbersAsStrings.length = ;

        }

    }
}
