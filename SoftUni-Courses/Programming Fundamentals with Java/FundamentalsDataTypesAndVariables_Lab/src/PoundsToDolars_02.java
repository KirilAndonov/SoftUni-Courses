import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDolars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound = Integer.parseInt(scanner.nextLine());
       BigDecimal dolars = new BigDecimal("1.36");
       BigDecimal convert = new BigDecimal(pound);
       convert = convert.multiply(dolars);

        System.out.printf("%.3f", convert);
    }
}
