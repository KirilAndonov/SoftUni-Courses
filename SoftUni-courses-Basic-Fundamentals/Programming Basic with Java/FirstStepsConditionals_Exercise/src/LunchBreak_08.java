import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String movieName = scanner.nextLine();
int serialTime = Integer.parseInt(scanner.nextLine());
int breakTime =Integer.parseInt(scanner.nextLine());
double lunchTime = breakTime / 8.0;
double relaxTime = breakTime / 4.0;
double timeForAll = serialTime + lunchTime + relaxTime;
double diff = Math.abs(timeForAll - breakTime);
double diffUp = Math.ceil(diff);
if (timeForAll <= breakTime) {
    System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieName, diffUp);}
else {
    System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieName, diffUp);
}
    }
}
