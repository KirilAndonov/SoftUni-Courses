import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetables = Double.parseDouble(scanner.nextLine());
        double fruits = Double.parseDouble(scanner.nextLine());
        double totalVegetables = Double.parseDouble(scanner.nextLine());
        double totalFruits = Double.parseDouble(scanner.nextLine());
        double sumVegetables = vegetables * totalVegetables;
        double sumFruits = fruits * totalFruits;
        double sumTotal = (sumFruits + sumVegetables) / 1.94;

        System.out.printf("%.2f ", sumTotal);

        }

    }

