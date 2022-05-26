import java.util.Scanner;
public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = (hour * 60) + minutes + 15;
        int newHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;
        if (newHour > 23) {newHour = 0;}
        System.out.printf("%d:%02d", newHour, newMinutes);
        }


    }




