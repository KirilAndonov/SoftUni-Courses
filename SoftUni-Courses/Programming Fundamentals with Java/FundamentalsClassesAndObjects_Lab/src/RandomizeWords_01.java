
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String [] line = scanner.nextLine().split(" ");
        Random random = new Random();
        for (int i = 0; i < line.length; i++) {
            random.nextInt(line.length);


        }
    }
}
