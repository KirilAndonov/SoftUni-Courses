import java.util.Scanner;

public class UsdToBgn_01 {
    public static void main(String[] args) {
        //: 1 USD = 1.79549 BGN.
        Scanner scanner = new Scanner(System.in);
        double bgn = Double.parseDouble(scanner.nextLine());
        double usdToBgn = bgn * 1.79549;
        System.out.println(usdToBgn);

    }
}
