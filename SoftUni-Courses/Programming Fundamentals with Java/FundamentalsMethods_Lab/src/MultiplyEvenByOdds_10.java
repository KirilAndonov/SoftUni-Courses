import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvenByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] numbers = Arrays
     .stream(scanner.nextLine().split(""))
     .mapToInt(Integer::parseInt)
     .toArray();
        System.out.println(multiplyEvenByOdd(numbers));

    }

    private static int multiplyEvenByOdd(int[] numbers) {
        return sumEvenDigits(numbers) * sumOddDigits(numbers);
    }

    private static int sumOddDigits(int[] numbers) {
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                sumOdd += numbers[i];
            }
        }
        return sumOdd;
    }
    private static int sumEvenDigits(int[] numbers) {
        int sumEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                sumEven += numbers[i];
            }
        }
        return sumEven;
    }

}
