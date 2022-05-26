import java.util.Scanner;

public class GrandpaStavri_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalLiters = 0;
        double totalDegrees = 0;
        for (int day = 1; day <= days ; day++) {
            double quantityRakia = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());

            totalLiters = totalLiters + quantityRakia;
            totalDegrees = totalDegrees + quantityRakia * degrees;

        }
double averageDegrees = totalDegrees / totalLiters;
        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", averageDegrees);

        if(averageDegrees < 38){
        System.out.println("Not good, you should baking!");
        }else if(averageDegrees >= 38 && averageDegrees <= 42){
            System.out.println("Super!");
        }else if(averageDegrees > 42){
            System.out.println("Dilution with distilled water!");
        }


    }
}
