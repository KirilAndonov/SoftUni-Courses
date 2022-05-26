import java.util.Scanner;

public class CourierExpress_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weighOfPackage = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        double distance = Double.parseDouble(scanner.nextLine());
//•	За пратки по - леки от 1 кг – на килограм по 80 % от съответната цена на километър
//•	От 1 кг до 10  кг – на килограм по 40 % от съответната цена на километър
//•	От 10 кг вкл. до 40 кг – на килограм по 5 % от съответната цена на километър
//•	От 40 кг вкл. до 90  кг – на килограм по 2 % от съответната цена на километър
//•	От 90 кг вкл. до 150 кг – на килограм по 1 % от съответната цена на километър
        double sumOfDelivery = 0;
        switch (service) {
            case "standard":
                if (weighOfPackage < 1) {
                    sumOfDelivery = distance * 0.03;
                } else if (weighOfPackage >= 1 && weighOfPackage < 10) {
                    sumOfDelivery = distance * 0.05;
                } else if (weighOfPackage >= 10 && weighOfPackage < 40) {
                    sumOfDelivery = distance * 0.1;
                } else if (weighOfPackage >= 40 && weighOfPackage < 90) {
                    sumOfDelivery = distance * 0.15;
                } else if (weighOfPackage >= 90 && weighOfPackage < 150) {
                    sumOfDelivery = distance * 0.2;
                }
                break;
            case "express":
                if (weighOfPackage < 1) {
                    double moreCost = 0.03 * 0.8;
                    double totalMoreCost = moreCost * weighOfPackage;
                    double total = totalMoreCost * distance;
                    sumOfDelivery = distance * 0.03 + total;
                } else if (weighOfPackage >= 1 && weighOfPackage < 10) {
                    double moreCost = 0.05 * 0.4;
                    double totalMoreCost = moreCost * weighOfPackage;
                    double total = totalMoreCost * distance;
                    sumOfDelivery = distance * 0.05 + total;
                } else if (weighOfPackage >= 10 && weighOfPackage < 40) {
                    double moreCost = 0.1 * 0.05;
                    double totalMoreCost = moreCost * weighOfPackage;
                    double total = totalMoreCost * distance;
                    sumOfDelivery = distance * 0.1 + total;
                } else if (weighOfPackage >= 40 && weighOfPackage < 90) {
                    double moreCost = 0.15 * 0.02;
                    double totalMoreCost = moreCost * weighOfPackage;
                    double total = totalMoreCost * distance;
                    sumOfDelivery = distance * 0.15 + total;
                } else if (weighOfPackage >= 90 && weighOfPackage < 150) {
                    double moreCost = 0.20 * 0.01;
                    double totalMoreCost = moreCost * weighOfPackage;
                    double total = totalMoreCost * distance;
                    sumOfDelivery = distance * 0.2 + total;
                }
                break;

        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weighOfPackage, sumOfDelivery);
    }
}