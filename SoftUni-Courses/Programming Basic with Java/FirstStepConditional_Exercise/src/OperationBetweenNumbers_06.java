import java.util.Scanner;

public class OperationBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);

        double result = 0;
        String evenOrOdd ="";
        switch (symbol) {

            case '+':
                result = number1 + number2;

                if (result % 2 == 0){
                    evenOrOdd = "even";

                } else {
                    evenOrOdd = "odd";
                }  System.out.printf("%d %c %d = %.0f - %s", number1, symbol, number2, result, evenOrOdd);
                break;
            case '-':
                result = number1 - number2;

                if (result % 2 == 0){
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }  System.out.printf("%d %c %d = %.0f - %s", number1, symbol, number2, result, evenOrOdd);
                break;
            case '*':
                result = number1 * number2;
                if (result % 2 == 0){
                   evenOrOdd = "even";
                } else {
                   evenOrOdd = "odd";
                }  System.out.printf("%d %c %d = %.0f - %s", number1, symbol, number2, result, evenOrOdd);
                break;
            case '/':
                if (number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else {
                result = number1 * 1.0  / number2;
                System.out.printf("%d %c %d = %.2f", number1, symbol, number2, result);}

                break;
            case '%':
                if (number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else{
                result = number1 % number2;
                    System.out.printf("%d %c %d = %.0f", number1, symbol, number2, result);}

                break;


        }


    }
}
