import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocation = Integer.parseInt(scanner.nextLine());

        for (int location = 1; location <= numLocation ; location++) {
            double expectedAverageGold = Double.parseDouble(scanner.nextLine());
            int numWorkDays = Integer.parseInt(scanner.nextLine());
            double totalGold = 0;
            for (int goldForDay = 1; goldForDay <= numWorkDays ; goldForDay++) {
                double earnGoldForDay = Double.parseDouble(scanner.nextLine());
                totalGold = totalGold + earnGoldForDay;
            }
            double averageGold = totalGold  / numWorkDays;

            if(averageGold >= expectedAverageGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            } else{
                System.out.printf("You need %.2f gold.%n", expectedAverageGold - averageGold);
            }

        }


    }
}
