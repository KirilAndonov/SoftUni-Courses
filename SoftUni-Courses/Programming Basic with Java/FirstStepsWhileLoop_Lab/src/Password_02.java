import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String currentPassword = scanner.nextLine();

        while (!currentPassword.equals(password)) {
            currentPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);

    }
}
