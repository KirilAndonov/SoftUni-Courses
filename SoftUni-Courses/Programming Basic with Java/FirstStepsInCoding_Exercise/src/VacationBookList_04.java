import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalHoursPerBook = pagesInBook / pagesPerHour;
        int daysPerBook = totalHoursPerBook / days;
        System.out.println(daysPerBook);

    }
}
