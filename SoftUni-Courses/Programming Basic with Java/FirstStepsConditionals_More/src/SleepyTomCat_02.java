import java.util.Scanner;

public class SleepyTomCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - freeDays;
        int freeHoursOfPlay = freeDays * 127;
        int workHoursOfPlay = workDays * 63;
        int totalHoursOfPlay = freeHoursOfPlay + workHoursOfPlay;
        int diff = Math.abs(totalHoursOfPlay - 30000);
        int hours = diff / 60;
        int min = diff % 60;
        if (totalHoursOfPlay < 30000) {
            System.out.printf("Tom sleeps well%n");
            System.out.printf("%d hours and %d minutes less for play", hours, min);}
        else {
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", hours, min);
        }
    }
}
