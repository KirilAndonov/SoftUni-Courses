import java.util.Scanner;

public class SignOfIntegers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkIfIsPositiveOrNot(scanner);

    }

    private static void checkIfIsPositiveOrNot(Scanner scanner) {
        int number = Integer.parseInt(scanner.nextLine());
        if(number > 0){
            System.out.printf("The number %d is positive.", number);
        }else if(number < 0){
            System.out.printf("The number %d is negative.", number);
        }else {
            System.out.printf("The number %d is zero.", number);
        }
    }
}
