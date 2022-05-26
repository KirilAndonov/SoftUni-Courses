import java.util.Scanner;

public class Pets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int kiloesFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());
        double totalFood = days * (dogFood + catFood + (turtleFood / 1000));
        double diff = Math.abs(kiloesFood - totalFood);
        if (kiloesFood >= totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));}
else {System.out.printf("%.0f more kilos of food are needed.", Math.ceil(diff));}
    }
}
