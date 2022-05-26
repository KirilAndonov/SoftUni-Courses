import java.util.Scanner;

public class Fishland_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double scumriq = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());

        double pricePalamud = scumriq + (scumriq * 0.60);
        double sumPalamud = pricePalamud * kgPalamud;
        double priceSafrid = caca + (caca * 0.80);
        double sumSafrid = priceSafrid * kgSafrid;
        double priceMidi = 7.50;
        double sumMidi = kgMidi * priceMidi;
        double totalPrice = sumPalamud + sumSafrid + sumMidi;
        System.out.printf("%.2f ", totalPrice);



    }
}
