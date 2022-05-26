import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int result = sumTheFirstTwo(firstNum, secondNum) - thirdNum;
        System.out.println(result);
    }
    private static int sumTheFirstTwo(int firstNum, int secondNum) {
        return firstNum + secondNum;

    }
}
