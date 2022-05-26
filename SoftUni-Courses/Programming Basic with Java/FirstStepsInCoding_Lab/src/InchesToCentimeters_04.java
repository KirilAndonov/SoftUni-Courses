import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
        Double sm = inches * 2.54;

        System.out.println(sm);


    }
}
