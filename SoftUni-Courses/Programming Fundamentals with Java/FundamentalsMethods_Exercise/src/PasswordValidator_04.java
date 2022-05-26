
import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (isPasswordLongEnough(password) && isPasswordHaveTwoDigits(password) &&
                isPasswordConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!isPasswordLongEnough(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isPasswordConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isPasswordHaveTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isPasswordHaveTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counter++;
            }
        }
        if (counter < 2) {
            return false;
        }
        return true;
    }

    private static boolean isPasswordConsistOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if (symbol < 97 || symbol > 122) {
                if (symbol < 48 || symbol > 57) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPasswordLongEnough(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            counter++;
        }
        if (counter < 6 || counter > 10) {
            return false;
        }
        return true;
    }
}
