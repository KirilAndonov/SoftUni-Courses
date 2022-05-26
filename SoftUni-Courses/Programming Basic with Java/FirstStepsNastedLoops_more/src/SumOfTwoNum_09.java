import java.util.Scanner;

public class SumOfTwoNum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
boolean isTrue = true;
        for (int i = start; i <= stop; i++) {
            if(!isTrue){
                break;
            }
            for (int j = start; j <= stop; j++) {
                counter++;
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);
                    isTrue = false;
                    break;
                }
            }

            }
if (isTrue){
    System.out.printf("%d combinations - neither equals %d", counter, magicNum);
}
        }
}
