import java.util.Scanner;



public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int length = 1; length <= number ; length++) {
            printIncreasingNumber(length);
        }
       for (int length = number - 1; length >= 1 ; length--) {
           printIncreasingNumber(length);
        }
    }

    private static void printIncreasingNumber(int length) {
        for (int i = 1; i <= length ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
