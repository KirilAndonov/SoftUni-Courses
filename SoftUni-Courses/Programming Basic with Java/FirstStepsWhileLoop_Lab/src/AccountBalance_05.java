import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String command = scanner.nextLine();
double totalMoney = 0;
        while (!command.equals("NoMoreMoney")){
            double sum = Double.parseDouble(command);
            if (sum < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", sum);
                totalMoney = totalMoney + sum;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", totalMoney);

    }
}
