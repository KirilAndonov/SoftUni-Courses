import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        double percentDiscount = Double.parseDouble(scanner.nextLine());

        double sumPens = pens * 5.80;
        double sumMarkers = markers * 7.20;
        double sumDetergent = detergent * 1.2;
        double totalSumForSupplies = sumPens + sumMarkers + sumDetergent;
      double priceWithDiscount = totalSumForSupplies - (totalSumForSupplies * (percentDiscount / 100));
        System.out.println(priceWithDiscount);


    }
}
