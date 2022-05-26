import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < integerArr.length; i++) {
         int currentNum = integerArr[i];
            for (int j = i + 1; j < integerArr.length; j++) {
                if((currentNum + integerArr[j]) == magicNum){
                    System.out.print(currentNum + " " + integerArr[j]);
                    System.out.println();
                }
            }
        }
    }
}