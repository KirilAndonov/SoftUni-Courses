import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Nay = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razer = Integer.parseInt(scanner.nextLine());
        int hours =Integer.parseInt(scanner.nextLine());

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        double sumNay = (Nay + 2) * 1.5;
        double sumPaint = (paint *1.10) * 14.50;
        double sumRazer = razer * 5.00;
        double totalCostMaterials = sumNay + sumPaint + sumRazer + 0.40;
        double moneyForWorker = totalCostMaterials * 0.3 * hours;
        double totalCostForEveryting = totalCostMaterials + moneyForWorker;
        System.out.println(totalCostForEveryting);


    }
}
