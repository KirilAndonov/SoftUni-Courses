import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
double sum = 0.0;

        switch (season) {
            case "Summer":
            case "Autumn":
                if ((people % 2 == 0) && season.equals("Summer")){
                if(people <= 6){
                    sum = (4200 * 0.90) * 0.95;
                }
                else if (people <= 11){
                    sum = (4200 * 0.85) * 0.95;
                }
                else if (people > 12){
                    sum = (4200 * 0.75) * 0.95;
                }} else {
                    if(people <= 6){
                        sum = 4200 * 0.90;
                    }
                    else if (people <= 11){
                        sum = 4200 * 0.85;
                    }
                    else  {
                        sum = 4200 * 0.75;
                    }
                }
                break;

            case "Winter":

                if (people % 2 == 0) {
                    if(people <= 6){
                        sum = (2600 * 0.90) * 0.95;
                    }
                    else if (people <= 11){
                        sum = (2600 * 0.85) * 0.95;
                    }
                    else if (people > 12){
                        sum = (2600 * 0.75) * 0.95;
                    }} else {
                    if(people <= 6){
                        sum = 2600 * 0.90;
                    }
                    else if (people <= 11){
                        sum = 2600 * 0.85;
                    }
                    else  {
                        sum = 2600 * 0.75;
                    }
                }
                break;
            case "Spring":

                if (people % 2 == 0) {
                    if(people <= 6){
                        sum = (3000 * 0.90) * 0.95;
                    }
                    else if (people <= 11){
                        sum = (3000 * 0.85) * 0.95;
                    }
                    else if (people > 12){
                        sum = (3000 * 0.75) * 0.95;
                    }} else {
                    if(people <= 6){
                        sum = 3000 * 0.90;
                    }
                    else if (people <= 11){
                        sum = 3000 * 0.85;
                    }
                    else  {
                        sum = 3000 * 0.75;
                    }
                }
                break;

        }
        double diff = Math.abs(sum - budget);
        if (budget >= sum){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
