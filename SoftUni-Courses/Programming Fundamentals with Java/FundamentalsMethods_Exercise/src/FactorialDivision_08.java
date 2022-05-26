
import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNum = Integer.parseInt(scanner.nextLine());
        long secondNum = Integer.parseInt(scanner.nextLine());
long firstSum = firstFactorial(firstNum);
long secondSum = secondFactorial(secondNum);
double result = firstSum * 1.0 / secondSum ;
        System.out.printf("%.2f", result);
    }
        private static long firstFactorial(long firstNum) {
           long sum = 1;
           for (int i = 1; i < firstNum; i++) {
              sum = sum * (i + 1);
          }return sum;
        }
    private static long secondFactorial(long secondNum) {
        long sum = 1;
        for (int i = 1; i < secondNum; i++) {
            sum = sum * (i + 1);
        }return sum;
    }
}