import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        double total = 0;
        double totalNumbers = 0;

        for (int i = 1; i <= moves ; i++) {
            double score = Double.parseDouble(scanner.nextLine());

            totalNumbers++;

            if(score < 0 || score > 50){
                p6++;
              total = total / 2;

            }else {
                if(score <= 9){
                    p1++;
                    score = score * 0.20;
                    total = total + score;
                }else if (score <= 19) {
                    p2++;
                    score = score * 0.30;
                    total = total + score;
                }else if (score <= 29){
                    p3++;
                    score = score * 0.40;
                    total = total + score;
                }else if (score <= 39){
                    p4++;
                    score =  50;
                    total = total + score;
                }else {
                    p5++;
                    score = 100;
                    total = total + score;
                }
            }


        }

        System.out.printf("%.2f%n", total);
        System.out.printf("From 0 to 9: %.2f%%%n", p1 / totalNumbers * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", p2 / totalNumbers * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", p3 / totalNumbers * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", p4 / totalNumbers * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", p5 / totalNumbers * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", p6 / totalNumbers * 100);
    }
}
