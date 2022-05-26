import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
int counterSpendDays = 0;
int counterDays = 0;
double totalSum = availableMoney;
boolean isTrue = false;
        while (counterSpendDays != 5){
            String action = scanner.nextLine();
            double spendOrSaveSum = Double.parseDouble(scanner.nextLine());
            if(action.equals("spend")){
                counterDays++;
                counterSpendDays++;
                totalSum = totalSum - spendOrSaveSum;
             if(totalSum < 0){
                totalSum = 0;

             }
            }else if (action.equals("save")){
                totalSum = totalSum + spendOrSaveSum;
                counterSpendDays = 0;
                counterDays++;}
                if(totalSum >= neededMoney) {
                    isTrue = true;
                    break;
                }
            }
            if(isTrue){
                System.out.printf("You saved the money for %d days.", counterDays);
            }else {
                System.out.println("You can't save the money.");
                System.out.printf("%d", counterDays);
            }



    }
}
