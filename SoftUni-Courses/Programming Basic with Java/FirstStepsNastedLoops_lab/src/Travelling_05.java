import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String text = scanner.nextLine();


        while (!text.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double totalSave = 0;
            while (totalSave < budget){
                double saveMoney = Double.parseDouble(scanner.nextLine());
                totalSave = totalSave + saveMoney;
            }
            System.out.printf("Going to %s!%n", text);
            text = scanner.nextLine();
        }



    }
}
