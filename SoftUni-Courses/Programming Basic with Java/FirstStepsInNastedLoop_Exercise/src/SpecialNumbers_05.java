import java.util.Scanner;

public class SpecialNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
int currentNum = i;
int counter = 0;
            for (int j = 4; j >= 1 ; j--) {
                double figure = currentNum % 10;
               if(n % figure == 0){
                   counter++;
               }else {
                   break;
               } currentNum = currentNum / 10;
            }
if(counter == 4){
    System.out.print(i + " ");
}
        }


    }
}
