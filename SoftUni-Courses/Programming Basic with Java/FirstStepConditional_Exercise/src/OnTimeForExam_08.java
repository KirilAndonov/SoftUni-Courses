import java.util.Scanner;

public class OnTimeForExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hoursArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int timeExamMinutes = (hoursExam * 60) + minutesExam;
        int timeArrivalMinutes = (hoursArrival * 60) + minutesArrival;
        int diff = Math.abs(timeExamMinutes - timeArrivalMinutes);


        if (timeExamMinutes < timeArrivalMinutes) {
            System.out.println("Late");
            if (diff >= 60) {
                int hours = diff / 60;
                int minute = diff % 60;
                System.out.printf("%d:%02d hours after the start", hours, minute);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if ((timeArrivalMinutes == timeExamMinutes) || (diff <= 30)) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hours = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
