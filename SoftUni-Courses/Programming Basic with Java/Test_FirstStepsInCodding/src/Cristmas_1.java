import java.util.Scanner;

public class Cristmas_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int material = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());



        double sumPaper = paper * 5.80;
        double sumMaterial = material * 7.20;
        double sumGlue = glue * 1.20;
        double sumTotal = sumPaper + sumMaterial + sumGlue;
        double discount = sumTotal * (percentDiscount * 1.0 / 100);
        double finSum = sumTotal - discount;
        System.out.printf("%.3f", finSum);

    }
}
