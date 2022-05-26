import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int yearsOld = 18;
int counterOddYears = -1;



        for (int i = 1800; i <= year ; i++) {
            if(i % 2 == 0){
                counterOddYears++;
                money = money - 12000;
            }else {
                counterOddYears++;
                money = money - (12000 + 50 * (yearsOld + counterOddYears));
            }
        }
        double diff = Math.abs(money);
        if (money >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }


    }
}
