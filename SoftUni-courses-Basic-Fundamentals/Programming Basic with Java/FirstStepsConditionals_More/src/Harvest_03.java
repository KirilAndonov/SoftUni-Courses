import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areaGrape = Integer.parseInt(scanner.nextLine());
        double grapeKiloesForMeter = Double.parseDouble(scanner.nextLine());
        int needetLitersWine = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());
        double areaForUse = areaGrape * 0.40;
        double kiloesGrape = areaForUse * grapeKiloesForMeter;
        double litersWine = Math.floor(kiloesGrape / 2.5);
        double leftWine =Math.ceil(kiloesGrape/2.5 -needetLitersWine );
        double equalLitersForWorker =(kiloesGrape/2.5-needetLitersWine)/ numberOfWorkers;
        double lackOfWine = needetLitersWine - kiloesGrape / 2.5;
        if (litersWine >= needetLitersWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", litersWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", leftWine, Math.ceil(equalLitersForWorker));}
        else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(lackOfWine));
        }

    }
}