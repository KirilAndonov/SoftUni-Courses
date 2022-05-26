import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsLili = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
int moneyPrice = 0;
int allmoney = 0;
        int toyscounter = 0;
int brotherCounter = 0;
        for (int i = 1; i <= yearsLili ; i++) {
            if (i % 2 == 0){
                brotherCounter++;
                moneyPrice = moneyPrice + 10;
                allmoney = allmoney + moneyPrice;
            } else {toyscounter++;}

        }
int moneytoys = toyscounter * toyPrice;
        int totalmoney = moneytoys + (allmoney - brotherCounter);
        double diff = Math.abs(totalmoney - priceWashMachine);
if (totalmoney >= priceWashMachine){
    System.out.printf("Yes! %.2f", diff);
}else {
    System.out.printf("No! %.2f", diff);
}

    }
}
