import java.util.Scanner;

public class MultiplyEvenOdd_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyEvenByOdd(number));
    }

    private static int multiplyEvenByOdd(int number) {
        return sumEvenDigits(number) * sumOddDigits(number);
    }

    private static int sumOddDigits(int number) {
        int sumOdd = 0;
        while (number != 0){
            int digit = number % 10;
            if(digit % 2 != 0){
                sumOdd += digit;
            }
            number = number / 10;
        }
        return sumOdd;
    }


    private static int sumEvenDigits(int number) {
        int sumEven = 0;
        while (number != 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                sumEven += digit;
            }
            number = number / 10;
        }
        return sumEven;
    }
}
