import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String CompanyName = scanner.nextLine();
int NumbersTickets = Integer.parseInt(scanner.nextLine());
int NumberKidsTickets = Integer.parseInt(scanner.nextLine());
double NetPriceTickets = Double.parseDouble(scanner.nextLine());
double PriceService = Double.parseDouble(scanner.nextLine());

//•	"The profit of your agency from {име на авиокомпанията} tickets is {печалба за агенцията} lv."
        double SumKidsTicket = NetPriceTickets - (NetPriceTickets * 0.7);
        double TicketServiceAdult = NetPriceTickets + PriceService;
        double TicketServiceKids = SumKidsTicket +PriceService;
        double SumTicketsAdults = NumbersTickets * TicketServiceAdult;
        double SumAllKidsTicket = NumberKidsTickets * TicketServiceKids;
        double TotalSumTickets = SumTicketsAdults + SumAllKidsTicket;
double Profit = TotalSumTickets * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv. ", CompanyName, Profit);

}




    }

