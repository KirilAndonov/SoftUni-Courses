import java.util.Scanner;
public class Firm_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int daysToBeDone = Integer.parseInt(scanner.nextLine());
        int numberWorkersOutTime = Integer.parseInt(scanner.nextLine());
        double workDays = daysToBeDone - ( daysToBeDone * 0.10);
        double workHours = workDays * 8.0;
        double workHoursAltOfTime = numberWorkersOutTime * 2.0 * daysToBeDone;
        double allHoursForWork = Math.floor(workHours + workHoursAltOfTime);
        double diff = Math.abs( neededHours - allHoursForWork);
        if (allHoursForWork >= neededHours) {
            System.out.printf("Yes!%.0f hours left.", diff);}
        else {
            System.out.printf("Not enough time!%.0f hours needed.", diff);
        }

    }
}
