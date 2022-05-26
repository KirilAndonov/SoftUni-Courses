import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printVowels(text);

    }

    private static void printVowels(String text) {
        int counter = 0;
        for (int i = 0; i < text.length() ; i++) {
            char letter = text.toLowerCase().charAt(i);
            if(letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117 || letter == 121){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
