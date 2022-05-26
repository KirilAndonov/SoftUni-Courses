import java.util.Scanner;

public class SumNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
int sum = 0;
        for (int n = 1; n <= number; n++){

            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}
