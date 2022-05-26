import java.util.Scanner;

public class Profit_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int twoLev = Integer.parseInt(scanner.nextLine());
        int fiveLev = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int one = 0; one <= oneLev ; one++) {
            for (int two = 0; two <= twoLev ; two++) {
                for (int five = 0; five <= fiveLev ; five++) {
                    if(one + two + five == sum){

                    }

                }

            }

        }

    }
}
