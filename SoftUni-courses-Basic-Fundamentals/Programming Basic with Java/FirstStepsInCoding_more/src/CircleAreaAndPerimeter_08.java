import java.util.Scanner;

public class CircleAreaAndPerimeter_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rr = Double.parseDouble(scanner.nextLine());

        double rArea = Math.PI * rr * rr;
        double rPerimeter = 2.0 * Math.PI * rr;
        System.out.printf("%.2f %n ", rArea);
        System.out.printf("%.2f ", rPerimeter);
    }
}
