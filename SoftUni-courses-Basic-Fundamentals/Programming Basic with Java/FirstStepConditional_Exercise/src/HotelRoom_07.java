import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double priceApartment = 0.0;
        double priceStudio = 0.0;

        switch (month) {
            case "May":
            case "October":
                if (days <= 7) {
                    priceApartment = days * 65;
                    priceStudio = days * 50;
                }else if (days < 14) {
                    priceApartment = days * 65;
                    priceStudio = (days * 50) * 0.95;
                }
                else{
            priceApartment = (days * 65) * 0.90;
            priceStudio = (days * 50) * 0.70;}
                break;

        case "June":
        case "September":
        if (days > 14) {
            priceApartment = (days * 68.70) * 0.90;
            priceStudio = (days * 75.20) * 0.80;
        } else {
            priceApartment = (days * 68.70);
            priceStudio = (days * 75.20);
        }

        break;
        case "July":
        case "August":
        if (days > 14) {
            priceApartment = (days * 77) * 0.90;
            priceStudio = days * 76;
        } else {
            priceApartment = days * 77;
            priceStudio = days * 76;}
        break;}


        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }

        }

