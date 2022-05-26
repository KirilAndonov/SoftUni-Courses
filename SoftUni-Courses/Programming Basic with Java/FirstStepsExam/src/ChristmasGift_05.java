import java.util.Scanner;

public class ChristmasGift_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int counterKids = 0;
        int counterAdults = 0;
        while (!command.equals("Christmas")) {
        int years = Integer.parseInt(command);
        if(years <= 16){
            counterKids++;
        }else {
            counterAdults++;
        }
        command = scanner.nextLine();}
        System.out.printf("Number of adults: %d%n", counterAdults);
        System.out.printf("Number of kids: %d%n", counterKids);
        System.out.printf("Money for toys: %d%n", counterKids * 5);
        System.out.printf("Money for sweaters: %d%n", counterAdults * 15);
    }
}
