import java.util.Scanner;

public class EvenAndOddSubstraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String list = scanner.nextLine();
        String[] allNumSplit = list.split("\\s+");

        int evenSum = 0;
        int oddSum = 0;
        for (String s : allNumSplit) {
            int currentNum = Integer.parseInt(s);
            if (currentNum % 2 == 0) {
                evenSum = evenSum + currentNum;
            } else {
                oddSum = oddSum + currentNum;
            }
        }
        System.out.println(evenSum - oddSum);

    }
}
