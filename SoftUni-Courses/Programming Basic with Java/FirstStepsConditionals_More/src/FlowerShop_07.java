import java.util.Scanner;
public class FlowerShop_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolia = Integer.parseInt(scanner.nextLine());
        int zumbul = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int kaktos = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());
        double totalProfit = ((magnolia * 3.25) + (zumbul * 4.0) + (roses * 3.50) + (kaktos * 8.0));
        double sumAfterTaxes = totalProfit - (totalProfit * 0.05);
        double diff = Math.abs(sumAfterTaxes - present);
        if (sumAfterTaxes >= present) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));}
        else {System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));}
    }
}
