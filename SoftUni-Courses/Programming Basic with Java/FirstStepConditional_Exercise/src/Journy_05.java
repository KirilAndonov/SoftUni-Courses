import java.util.Scanner;

public class Journy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
double sum = 0.0;
String country = "";
String place = "";
        if (budget <= 100){
            country = "Bulgaria";
            if(season.equals("summer")){
                place = "Camp";
                sum = budget * 0.30;
            }else if (season.equals("winter")){
                place = "Hotel";
                sum = budget * 0.70;
            }
        } else if(budget <= 1000){
            country = "Balkans";
            if(season.equals("summer")){
                place = "Camp";
                sum = budget * 0.40;
            }else if (season.equals("winter")){
                place = "Hotel";
                sum = budget * 0.80;
            }
        } else {
            country = "Europe";
            place = "Hotel";
            sum = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n" + "%s - %.2f", country, place, sum);

    }
}
