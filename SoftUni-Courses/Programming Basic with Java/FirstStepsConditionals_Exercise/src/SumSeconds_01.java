import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secoundTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());
        int totalTimeSec = firstTime + secoundTime + thirdTime;
        int min = totalTimeSec / 60;
        int sec = totalTimeSec % 60;
        System.out.printf("%d:%02d", min, sec);
    }
}
