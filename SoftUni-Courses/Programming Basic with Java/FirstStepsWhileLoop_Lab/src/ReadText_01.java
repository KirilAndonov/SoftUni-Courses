import java.util.Scanner;

public class ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
String currentText = "";
        while (!text.equals("Stop")){
            currentText = text;

            System.out.println(currentText);
            text = scanner.nextLine();
        }


    }
}
