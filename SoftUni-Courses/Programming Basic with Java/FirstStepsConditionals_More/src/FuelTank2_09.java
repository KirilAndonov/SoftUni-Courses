import java.util.Scanner;
public class FuelTank2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double litersOfFue = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double priceDiesel = litersOfFue * 2.33;
        double priceDieseDiscount = priceDiesel - (priceDiesel * 0.08);
        double priceDieselBigDiscount = priceDiesel - (priceDiesel * 0.10);
        double priceDieselClubCard = litersOfFue * (2.33 - 0.12);
        double prDiClDiscount = priceDieselClubCard - (priceDieselClubCard * 0.08);
        double priDiClBigDiscount = priceDieselClubCard - (priceDieselClubCard * 0.10);

        double priceGasiline = litersOfFue * 2.22;
        double priceGasolineDiscount = priceGasiline - (priceGasiline * 0.08);
        double priceGasilineBigDiscount = priceGasiline - (priceGasiline * 0.10);
        double priceGasolineClubCard = litersOfFue * (2.22 - 0.18);
        double prGaClCaDiscount = priceGasolineClubCard - (priceGasolineClubCard * 0.08);
        double prGaClBigDiscoint = priceGasolineClubCard - (priceGasolineClubCard * 0.10);

        double priceGas = litersOfFue * 0.93;
        double priceGasDiscount = priceGas - (priceGas * 0.08);
        double priceBigGasDiscount = priceGas - (priceGas * 0.10);
        double priceGasClubCard = litersOfFue * (0.93 - 0.08);
        double prGasClCaDiscount = priceGasClubCard - (priceGasClubCard * 0.08);
        double prGasClubBigDiscount = priceGasClubCard - (priceGasClubCard * 0.10);

        if ((typeOfFuel.equals("Diesel")) && (clubCard.equals("No"))) {
            if ((litersOfFue >= 20 &&litersOfFue <= 25)) {
                System.out.printf("%.2f lv.", priceDieseDiscount);}
            else if(litersOfFue > 25)
            { System.out.printf("%.2f lv.", priceDieselBigDiscount);}
            else if(litersOfFue <20){System.out.printf("%.2f lv.", priceDiesel);}}
        else if ((typeOfFuel.equals("Diesel")) && (clubCard.equals("Yes"))){
            if ((litersOfFue >= 20 &&litersOfFue <= 25)) {
                System.out.printf("%.2f lv.", prDiClDiscount);}
            else if(litersOfFue > 25)
            { System.out.printf("%.2f lv.", priDiClBigDiscount);}
            else if(litersOfFue <20){System.out.printf("%.2f lv.", priceDieselClubCard);}}

        else if ((typeOfFuel.equals("Gasoline")) && (clubCard.equals("No"))) {
            if ((litersOfFue >= 20  &&litersOfFue <= 25)) {
                System.out.printf("%.2f lv.", priceGasolineDiscount);}
            if (litersOfFue > 25) {
                System.out.printf("%.2f lv.", priceGasilineBigDiscount);}
            else if(litersOfFue < 20) {System.out.printf("%.2f lv.", priceGasiline);}}
        else if((typeOfFuel.equals("Gasoline")) && (clubCard.equals("Yes"))) {
            if ((litersOfFue >= 20 &&litersOfFue <= 25)) {
                System.out.printf("%.2f lv.", prGaClCaDiscount);}
            if (litersOfFue > 25) {
                System.out.printf("%.2f lv.", prGaClBigDiscoint);}
            else if(litersOfFue < 20) {System.out.printf("%.2f lv.", priceGasolineClubCard);}}

        else  if ((typeOfFuel.equals("Gas")) && (clubCard.equals("No"))){
            if((litersOfFue >= 20 &&litersOfFue <= 25)){
                System.out.printf("%.2f lv.", priceGasDiscount);}
            if (litersOfFue > 25) {
                System.out.printf("%.2f lv.", priceBigGasDiscount);}
            else if (litersOfFue < 20) {System.out.printf("%.2f lv.", priceGas);}}
        else  if ((typeOfFuel.equals("Gas")) && (clubCard.equals("Yes"))){
            if((litersOfFue >= 20 &&litersOfFue <= 25)){
                System.out.printf("%.2f lv.", prGasClCaDiscount);}
            if (litersOfFue > 25) {
                System.out.printf("%.2f lv.", prGasClubBigDiscount);}
            else if(litersOfFue < 20) {System.out.printf("%.2f lv.", priceGasClubCard);}}
    }
}