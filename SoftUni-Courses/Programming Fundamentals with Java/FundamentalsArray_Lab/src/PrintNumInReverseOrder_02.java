import java.util.Scanner;

public class PrintNumInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;}

            for (int j = numbers.length - 1; j >= 0; j--) {
                System.out.print(numbers[j] + " ");
            }

        }
    }
