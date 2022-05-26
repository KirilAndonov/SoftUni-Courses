import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int number = Integer.parseInt(scanner.nextLine());
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

        for(int n = 1; n <= number; n++  ){

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if(currentNumber > max){
                max = currentNumber;
            }
            if (currentNumber < min){
                min = currentNumber;
            }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min );
    }
}
