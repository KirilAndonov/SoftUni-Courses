import java.util.Scanner;

public class AddBaggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTwentyKilloesLugg = Double.parseDouble(scanner.nextLine());
        double killoesLugg = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int numbersOfLugg = Integer.parseInt(scanner.nextLine());

        double priceForKilos = 0.0;
        if(killoesLugg < 10)
        priceForKilos = priceTwentyKilloesLugg * 0.20;
        else if (killoesLugg <= 20)
            priceForKilos = priceTwentyKilloesLugg * 0.50;
        else  priceForKilos = priceTwentyKilloesLugg;

        if (daysToTrip > 30)
            priceForKilos = priceForKilos + (priceForKilos * 0.10);
        else if (daysToTrip < 7)
            priceForKilos = priceForKilos + (priceForKilos * 0.40);
        else priceForKilos = priceForKilos + (priceForKilos * 0.15);
        double totalPrice = priceForKilos * numbersOfLugg;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);

}
    }

