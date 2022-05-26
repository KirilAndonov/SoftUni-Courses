import java.util.Scanner;

public class LeftRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int n = 1; n <= number; n++){
            int firstNumbers = Integer.parseInt(scanner.nextLine());
            sum1 += firstNumbers;
        }
        for (int n = 1; n <= number; n++) {
            int secondNumbers = Integer.parseInt(scanner.nextLine());
            sum2 += secondNumbers;
        }
        int diff = Math.abs(sum1 - sum2);
        if (sum1 == sum2){System.out.printf("Yes, sum = %d", sum1 );}
        else {
            System.out.printf("No, diff = %d", diff);
        }

    }
}
