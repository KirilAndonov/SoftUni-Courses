import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double others = 0;
        int countMonths = 0;
        double electricity = 0;

        int months = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= months; i++) {
            countMonths++;
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricity = electricity + electricityBill;

            others = others + (electricityBill + 20 + 15) * 1.2;
        }
        double totalOthers = others;
        double totalWater = countMonths * 20;
        double totalNet = countMonths * 15;
        double totalElectricity = electricity;
        double averageTotal = (totalOthers + totalWater + totalNet + totalElectricity) / countMonths;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalNet);
        System.out.printf("Other: %.2f lv%n", totalOthers);
        System.out.printf("Average: %.2f lv%n", averageTotal);



    }
}
