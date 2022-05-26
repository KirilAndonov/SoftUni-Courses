import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int numTo200 = 0;
int numTo399 = 0;
int numTo599 = 0;
int numTo799 = 0;
int numAbove800 = 0;
int allNumbers = 0;

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number ; i++) {
            int courentNumber = Integer.parseInt(scanner.nextLine());
            allNumbers++;
            if(courentNumber < 200){
                numTo200++;
            }else if (courentNumber <= 399){
                numTo399++;
            }else if (courentNumber <= 599){
                numTo599++;
            }else if(courentNumber <= 799){
                numTo799++;
            }else {
                numAbove800++;
            }

        }
        System.out.printf("%.2f%%%n", numTo200 * 1.0 / allNumbers * 100);
        System.out.printf("%.2f%%%n", numTo399 * 1.0 / allNumbers * 100);
        System.out.printf("%.2f%%%n", numTo599 * 1.0 / allNumbers * 100);
        System.out.printf("%.2f%%%n", numTo799 * 1.0 / allNumbers * 100);
        System.out.printf("%.2f%%%n", numAbove800 * 1.0 / allNumbers * 100);
    }
}
