import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
int sumEven = 0;
int sumOdd = 0;

        for(int n = 1; n <= number; n++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0){
                sumEven += currentNumber;
            } else {sumOdd += currentNumber;}
        }
if (sumEven == sumOdd){
    System.out.println("Yes");
    System.out.println("Sum = " + sumEven);
} else {
    System.out.println("No");
    System.out.println("Diff = " + Math.abs(sumEven - sumOdd));
}




    }
}
