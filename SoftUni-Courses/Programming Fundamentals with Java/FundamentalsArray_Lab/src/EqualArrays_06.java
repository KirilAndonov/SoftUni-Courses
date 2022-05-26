import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] firstLineSplit = firstLine.split("\\s+");
        String[] secondLineSplit = secondLine.split("\\s+");
        int[] numFirst = new int[firstLineSplit.length];
        int[] numSecond = new int[secondLineSplit.length];

        boolean isTrue = false;
        int sum = 0;
        for (int i = 0; i < firstLineSplit.length; i++) {
            numFirst[i] = Integer.parseInt(firstLineSplit[i]);
        }
        for (int j = 0; j < secondLineSplit.length; j++) {
            numSecond[j] = Integer.parseInt(secondLineSplit[j]);

        if (numFirst[j] != numSecond[j]) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", j);
            return;
        } else {
            isTrue = true;
            sum = sum + numFirst[j];
        }
    }

if(isTrue){
    System.out.printf("Arrays are identical. Sum: %d", sum);}

    }
}