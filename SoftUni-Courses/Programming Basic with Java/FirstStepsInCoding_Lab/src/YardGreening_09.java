import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yard = Double.parseDouble(scanner.nextLine());
        double priceFor1metre = 7.61;
        double priceForYard = (yard * priceFor1metre);
        double discount = (priceForYard * 0.18);
        double finalPriceForYard = (priceForYard - discount);
        System.out.println( " The final price is " + finalPriceForYard + " lv. ");
        System.out.println( " The discount is " + discount + " lv. ");


    }
}
