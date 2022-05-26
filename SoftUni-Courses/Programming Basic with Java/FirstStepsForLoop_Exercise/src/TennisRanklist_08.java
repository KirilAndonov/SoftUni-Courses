import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int initionalsPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int winCounter = 0;
        for (int i = 1; i <= numberOfTournaments ; i++) {

            String condition = scanner.nextLine();
            switch (condition){
                case "W":
                    winCounter++;
                    points = points + 2000;
                    break;
                    case "F":
                        points = points + 1200;
                    break;
                    case "SF":
                        points = points + 720;
                    break;

            }
        }

        double average = points * 1.0 / numberOfTournaments;
        double percentOfWin = winCounter *1.0 / numberOfTournaments * 100;
        int totalPoints = initionalsPoints + points;

        System.out.println("Final points: " + totalPoints);
        System.out.printf("Average points: %.0f%n ", Math.floor(average));
        System.out.printf("%.2f%%", percentOfWin);

    }
}