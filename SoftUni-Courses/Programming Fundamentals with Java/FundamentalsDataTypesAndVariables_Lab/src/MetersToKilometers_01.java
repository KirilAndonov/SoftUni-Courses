import java.util.Scanner;

public class MetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meter = Integer.parseInt(scanner.nextLine());
        double kilometer = (double)meter / 1000;
        System.out.printf("%.2f", kilometer);


    }
}
