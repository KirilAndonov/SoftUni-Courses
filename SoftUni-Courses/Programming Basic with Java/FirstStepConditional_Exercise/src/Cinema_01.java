import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * colons;
        double totalPrice = 0;

        switch (type){
            case "Premiere":
                totalPrice = totalSeats * 12.00;
                break;
            case "Normal":
                totalPrice = totalSeats * 7.50;
                break;
            case "Discount":
                totalPrice = totalSeats * 5.00;
                break;
        }
        System.out.printf("%.2f leva", totalPrice);
    }
}
