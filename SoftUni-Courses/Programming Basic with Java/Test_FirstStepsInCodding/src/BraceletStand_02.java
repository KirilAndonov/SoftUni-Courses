import java.util.Scanner;

public class BraceletStand_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double salesMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double costForAllPeriod = Double.parseDouble(scanner.nextLine());
        double priceOfPresent = Double.parseDouble(scanner.nextLine());

        double saveMoney = (moneyPerDay * 5) + (salesMoneyPerDay * 5) - costForAllPeriod;

        if(saveMoney > priceOfPresent){
        System.out.printf("Profit: %.2f BGN, the gift has been purchased.", saveMoney);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.", priceOfPresent - saveMoney);

        }

    }
}
