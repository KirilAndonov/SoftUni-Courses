import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //: градус = радиан * 180 / π. Числото π в Java програми е достъпно чрез Math.PI.
        double radianss = Double.parseDouble(scanner.nextLine());
        double degrees = radianss * 180 / Math.PI;
        System.out.println(degrees);



    }
}
