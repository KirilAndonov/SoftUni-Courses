import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

//        •	Пилешко меню –  10.35 лв.
//        •	Меню с риба – 12.40 лв.
//        •	Вегетарианско меню  – 8.15 лв

        double sumChicken = chicken * 10.35;
                double sumFish = fish * 12.40;
                        double sumVegan = vegan * 8.15;
                        double allSumMenu = sumChicken + sumFish + sumVegan;
                        double sumDessert = allSumMenu * 0.20;
                        double delivery = 2.50;
                        double finSum = allSumMenu + sumDessert + delivery;
        System.out.println(finSum);



    }
}
