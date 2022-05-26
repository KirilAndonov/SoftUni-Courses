import java.util.Scanner;

public class FishTanck_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double longg = Double.parseDouble(scanner.nextLine());
        double windth = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent =Double.parseDouble(scanner.nextLine());

        double volume = (longg * windth * height) * 0.001;
        double allreadyTaken = volume - (volume * (percent / 100));


        System.out.println(allreadyTaken);


    }
}
