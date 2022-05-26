import java.util.Scanner;

public class Sequence2kPlus1_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
int newNumber = 1;
        while (newNumber <= number) {
            System.out.println(newNumber);
            newNumber = newNumber * 2 + 1;

        }

    }
}
