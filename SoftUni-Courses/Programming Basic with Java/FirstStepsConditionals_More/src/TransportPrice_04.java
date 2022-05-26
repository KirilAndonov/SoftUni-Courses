import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        double price = 0.70 + (0.79 * km);
        double priceNight = 0.70 + (0.90 * km);
        double priceBus = km * 0.09;
        double priceTrain = km * 0.06;
        if (km <20){
            String dayOrNight = scanner.nextLine();
            if (dayOrNight.equals("day"))
                System.out.printf("%.2f", price);
            else {System.out.printf("%.2f", priceNight);}
        }
        else if (km < 100) {
            System.out.printf("%.2f", priceBus);}
        else {
            System.out.printf("%.2f", priceTrain);
        }
    }
}
