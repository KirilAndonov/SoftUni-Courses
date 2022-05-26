import java.util.Scanner;

public class TirDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
double sum = 0.0;
        switch (season){
            case "Spring":
            case "Autumn":
                if(km <= 5000){
                    sum = km * 0.75;
                }
                else if(km <= 10000){
                    sum = km * 0.95;
                }
                else if (km <= 20000){
                    sum = km * 1.45;
                } break;
            case "Summer":
                if(km <= 5000){
                    sum = km * 0.90;
                }
                else if(km <= 10000){
                    sum = km * 1.10;
                }
                else if (km <= 20000){
                    sum = km * 1.45;
                } break;
            case "Winter":
                if(km <= 5000){
                    sum = km * 1.05;
                }
                else if(km <= 10000){
                    sum = km * 1.25;
                }
                else if (km <= 20000){
                    sum = km * 1.45;
                } break;
        }
double sumAfterTax = sum * 4 * 0.90;
        System.out.printf("%.2f", sumAfterTax);
    }
}
