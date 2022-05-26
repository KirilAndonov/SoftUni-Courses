

import java.util.Scanner;
public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double square = (a * a);
            System.out.printf("%.3f", square);
        }
         else if (figure.equals("rectangle")) {
             double a = Double.parseDouble(scanner.nextLine());
             double b = Double.parseDouble(scanner.nextLine());
             double rectangle = a * b;
            System.out.printf("%.3f", rectangle);
        }
        else if (figure.equals("circle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double circle = Math.PI * (a * a);
            System.out.printf("%.3f", circle);}
        else {
            double b = Double.parseDouble(scanner.nextLine());
            double a = Double.parseDouble(scanner.nextLine());
            double tiangle = a * b / 2;
            System.out.printf("%.3f", tiangle);
        }
    }
}


