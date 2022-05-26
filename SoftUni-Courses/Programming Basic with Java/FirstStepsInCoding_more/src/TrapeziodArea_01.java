import java.util.Scanner;

public class TrapeziodArea_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // Формулата за лице на трапец е (b1 + b2) * h / 2.

        double area = (b1 + b2) * (h / 2.0);
        System.out.printf("%.2f ", area);



    }
}
