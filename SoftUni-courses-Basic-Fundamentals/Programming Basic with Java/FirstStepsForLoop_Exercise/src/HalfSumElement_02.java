import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber;

            if(currentNumber > max){
                max = currentNumber;
            }
        }

        int sumWithoutMax = sum - max;
        int diff = Math.abs(sumWithoutMax - max);

        if(max == sumWithoutMax){
            System.out.printf("Yes%n");
            System.out.println("Sum = " + sumWithoutMax);
        }else {
            System.out.printf("No%n");
            System.out.printf("Diff = %d", diff);
        }

    }
}
