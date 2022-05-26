import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        int depositSum = Integer.parseInt(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double yearPercent = Double.parseDouble(scanner.nextLine());

        double timeAndIncrease = depositTime * ((depositSum * yearPercent / 100) / 12);
        double totalsum = depositSum + timeAndIncrease;
        System.out.println(totalsum);

    }
}
