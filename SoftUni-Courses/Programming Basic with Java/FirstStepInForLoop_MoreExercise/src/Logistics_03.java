import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCargoes = Integer.parseInt(scanner.nextLine());
double totalPrice = 0;
double totalTones = 0;
int p1 = 0;
int p2 = 0;
int p3 = 0;

        for (int i = 1; i <= countCargoes ; i++) {
            int tones = Integer.parseInt(scanner.nextLine());
           totalTones = totalTones + tones;

            if (tones <= 3){
                p1 = p1 + tones;
                totalPrice = totalPrice + (tones * 200);

            } else if(tones <= 11){
                p2 = p2 + tones;
                totalPrice = totalPrice + (tones * 175);

            } else {
                p3 = p3 + tones;
                totalPrice = totalPrice + (tones * 120);

            }
            
        }
        double averageTonesPrice = totalPrice / totalTones;
        System.out.printf("%.2f%n", averageTonesPrice);
        System.out.printf("%.2f%%%n", p1 / totalTones * 100);
        System.out.printf("%.2f%%%n", p2 / totalTones * 100);
        System.out.printf("%.2f%%%n", p3 / totalTones * 100);

    }
}
