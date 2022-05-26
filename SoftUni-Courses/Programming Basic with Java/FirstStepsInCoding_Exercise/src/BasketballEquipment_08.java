import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearBill = Integer.parseInt(scanner.nextLine());
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        double shoes = yearBill - (yearBill * 0.4);
        double suit = shoes - (shoes * 0.2);
                double ball = suit / 4;
                        double access = ball / 5;
double finSum = shoes + suit + ball + access + yearBill;
        System.out.println(finSum);

    }
}
