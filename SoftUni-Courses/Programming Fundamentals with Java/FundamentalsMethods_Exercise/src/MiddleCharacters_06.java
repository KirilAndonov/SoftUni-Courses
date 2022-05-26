import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacters(text);
    }

    private static void printMiddleCharacters(String text) {
        //3245
        if(text.length() % 2 == 0){
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        }else
            System.out.print(text.charAt(text.length() / 2));
    }
}
