import java.util.Scanner;

public class ReapeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatedTimes = Integer.parseInt(scanner.nextLine());
        String finalResult = repeatString(text, repeatedTimes);
        System.out.println(finalResult);
    }

    private static String repeatString(String text, int repeatedTimes) {
        String result = "";
        for (int i = 1; i < repeatedTimes; i++) {
            result = text;
            System.out.print(result);
        }
        return result;
    }
}
