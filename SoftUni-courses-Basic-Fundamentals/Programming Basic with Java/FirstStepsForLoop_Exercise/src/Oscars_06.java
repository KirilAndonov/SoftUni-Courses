import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
double totalPoints = academyPoints;

        for (int i = 1; i <= jury ; i++) {

            String nameJury = scanner.nextLine();
            int symbols = nameJury.length();
            double juryPoints = Double.parseDouble(scanner.nextLine());
           double currentPoints = symbols * 1.0 * juryPoints / 2;
            if(totalPoints < 1250.5){
                totalPoints = totalPoints + currentPoints;

            }

        }

        double diff = Math.abs(totalPoints - 1250.5);
        if (totalPoints > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);

        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);

        }
    }
}
