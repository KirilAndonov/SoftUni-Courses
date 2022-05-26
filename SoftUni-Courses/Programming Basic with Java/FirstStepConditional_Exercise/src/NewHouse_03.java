import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        switch (typeFlowers){
            case "Roses":
                if(countFlowers > 80){
                    totalPrice = countFlowers * 5.0 * 0.9;
                } else {
                    totalPrice = countFlowers * 5.0;
                }break;
            case "Dahlias":
                if(countFlowers > 90){
                    totalPrice = countFlowers * 3.80 * 0.85;
                }else { totalPrice = countFlowers * 3.80;
                }break;
            case "Tulips":
                if(countFlowers > 80){
                    totalPrice = countFlowers * 2.80 * 0.85;
                }else {
                    totalPrice = countFlowers * 2.80;
                }break;
            case "Narcissus":
                if(countFlowers < 120){
                    totalPrice = countFlowers * 3 * 1.15;
                }else {
                    totalPrice = countFlowers * 3;
                } break;
            case "Gladiolus":
                if(countFlowers < 80){
                    totalPrice = countFlowers * 2.50 * 1.20;
                }else {
                    totalPrice = countFlowers * 2.50;
                }
        }
if(budget >= totalPrice){
    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeFlowers, budget -totalPrice);
} else {
    System.out.printf("Not enough money, you need %.2f leva more.", totalPrice - budget);
}

    }
}
