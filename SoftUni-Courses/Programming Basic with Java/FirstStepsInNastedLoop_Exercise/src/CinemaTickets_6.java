import java.util.Scanner;

public class CinemaTickets_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = 0;
        int countStandard = 0;
        int countKid = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")){

            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeOfTicket = scanner.nextLine();

            int countTypes = 0;
            while (!typeOfTicket.equals("End")){
              countTypes++;
                switch (typeOfTicket){
                    case "student":
                        countStudents++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKid++;
                        break;
                }
              if(countTypes >= freeSeats){
                  break;
              }

              typeOfTicket = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.%n",command, countTypes * 1.0 / freeSeats * 100);

            command = scanner.nextLine();
        }
        int totalTickets = countStudents + countStandard + countKid;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudents * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", countKid * 1.0 / totalTickets * 100);
    }
}
