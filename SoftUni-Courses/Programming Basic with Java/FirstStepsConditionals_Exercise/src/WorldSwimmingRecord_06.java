import java.util.Scanner;
public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter =Double.parseDouble(scanner.nextLine());
        double timeforSwim = distance * timeForOneMeter;
        double timeResistence = Math.floor(distance / 15) * 12.5;
        double totaltime = timeforSwim + timeResistence;
        double diff = Math.abs(totaltime - record);
        if (totaltime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totaltime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }


    }
}
