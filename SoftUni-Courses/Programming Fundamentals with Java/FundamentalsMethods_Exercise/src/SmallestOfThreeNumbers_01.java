import java.util.Arrays;
import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printTheSmallestNumber(firstNum, secondNum, thirdNum);
    }

    private static void printTheSmallestNumber(int firstNum, int secondNum, int thirdNum) {
        int[] arr = new int[]{firstNum, secondNum, thirdNum};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
