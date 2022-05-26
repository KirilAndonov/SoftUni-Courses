import java.util.Scanner;

public class FuelTankPart209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType= scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String card= scanner.nextLine();

        double fuelPrice=0;
        double fuelPriceWithDiscount=0;
        if(fuelType.equals("Gas")){
            fuelPrice=0.93;
            fuelPriceWithDiscount=fuelPrice-0.08;

        }else if(fuelType.equals("Gasoline")){
            fuelPrice=2.22;
            fuelPriceWithDiscount=fuelPrice-0.18;
        }else if(fuelType.equals("Diesel")){
            fuelPrice=2.33;
            fuelPriceWithDiscount=fuelPrice-0.12;
        }
        if ( liters >=20 ){
            if(liters > 25) {
                fuelPrice = fuelPrice - fuelPrice * 0.1;
                fuelPriceWithDiscount = fuelPriceWithDiscount - fuelPriceWithDiscount * 0.1;
            }else if(liters<=25) {
                fuelPrice = fuelPrice-fuelPrice*0.08;
                fuelPriceWithDiscount = fuelPriceWithDiscount - fuelPriceWithDiscount*0.08;
            }
        }
        double totalWithCard =fuelPriceWithDiscount * liters;
        double totalWithoutCard=fuelPrice*liters;

        if (card.equals("Yes")) {
            System.out.printf("%.2f lv.",totalWithCard);

        }else if(card.equals("No")){

            System.out.printf("%.2f lv.",totalWithoutCard);

        }
    }
}