import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
int count = 0;
        for (int i = start; i <= end ; i++){
            for (int j = start; j <= end ; j++) {
                int sum = i + j;
                count++;
                if(sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magicNumber);

    }
}
