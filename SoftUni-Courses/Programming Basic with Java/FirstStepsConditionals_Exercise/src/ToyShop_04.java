import java.util.Scanner;
public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int numberPuzzle = Integer.parseInt(scanner.nextLine());
        int numberDoll = Integer.parseInt(scanner.nextLine());
        int numberTeddy = Integer.parseInt(scanner.nextLine());
        int numberMinyon = Integer.parseInt(scanner.nextLine());
        int numberTruck = Integer.parseInt(scanner.nextLine());
        double totalPricePuzzle = numberPuzzle * 2.60;
        double totalPriceDoll = numberDoll * 3.0;
        double totalPriceTeddy = numberTeddy * 4.10;
        double totalPriceMinyon = numberMinyon * 8.20;
        double totalPriceTruck = numberTruck * 2.0;
        double totalProfit = totalPricePuzzle + totalPriceDoll + totalPriceTeddy + totalPriceMinyon + totalPriceTruck;
        int totalNumberToys = numberPuzzle + numberDoll + numberTeddy + numberMinyon + numberTruck;
        double discount = 0;
        if (totalNumberToys >= 50) {discount = totalProfit * 0.25;}
        double earnMoney = totalProfit - discount;
        double rent = earnMoney * 0.10;
        double leftMoney = earnMoney - rent;
        if (leftMoney >= priceTrip){
            System.out.printf("Yes! %.2f lv left.", leftMoney - priceTrip);}
        else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(leftMoney - priceTrip));
        }

    }
}


