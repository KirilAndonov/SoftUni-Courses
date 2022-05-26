import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTopInteger(number);
    }

    private static void printTopInteger(int number) {
        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            if (currentNum > 10 ) {
                int counter = 0;
                int sum = 0;
                while (currentNum > 0) {
                    int digit = currentNum % 10;
                    if(digit % 2 != 0){
                        counter++;
                    }
                    currentNum = currentNum / 10;
                    sum += digit;
                }
                if (sum % 8 == 0 && counter > 0){
                    System.out.println(i);
                }
            }
        }
    }
}
