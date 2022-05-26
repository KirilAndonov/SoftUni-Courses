import java.util.Scanner;
public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processores = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int sumVideoCard = videoCards * 250;
        double sumProcessor = sumVideoCard * 0.35;
        double sumRam = sumVideoCard * 0.10;
        double totalSumProcessores = sumProcessor * processores;
        double totalSumRams = sumRam * ram;
        double totalSumAll = sumVideoCard + totalSumProcessores + totalSumRams;
        if (videoCards > processores) {totalSumAll = totalSumAll - (totalSumAll * 0.15);}
        double diff = Math.abs(totalSumAll - budget);
        if (budget >= totalSumAll){System.out.printf("You have %.2f leva left!", diff);}
        else {System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }


    }
}
