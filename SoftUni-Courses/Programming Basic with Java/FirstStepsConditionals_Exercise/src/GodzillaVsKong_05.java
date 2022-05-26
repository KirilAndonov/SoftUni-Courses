import java.util.Scanner;
public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistNumber = Integer.parseInt(scanner.nextLine());
        double priceForClothesForOneStatist = Double.parseDouble(scanner.nextLine());
        double sumfilmDecor = filmBudget * 0.10;
        if (statistNumber > 150){priceForClothesForOneStatist  = priceForClothesForOneStatist - (priceForClothesForOneStatist * 0.10);
        }
        double sumForClothes = priceForClothesForOneStatist * statistNumber;
        double totalSum = sumForClothes + sumfilmDecor;
        double diff = Math.abs(totalSum - filmBudget);
        if (totalSum > filmBudget){
            System.out.printf("Not enough money! %n" + "Wingard needs %.2f leva more.", diff);
        }
        else {
            System.out.printf("Action! %n" + "Wingard starts filming with %.2f leva left.", diff);
        }

    }
}
