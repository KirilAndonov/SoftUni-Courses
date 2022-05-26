import java.util.Scanner;

public class EqualSumsEvenOrOdd_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {
            int currentNum = i;
            int even = 0;
            int odd = 0;
            for (int j = 6; j >= 1 ; j--) {
                int currentSymbol = currentNum % 10;
                if(j % 2 == 0){
                    even = even + currentSymbol;
                } else {
                    odd = odd + currentSymbol;
                }  currentNum = currentNum / 10;

            }
            if(even == odd){
                System.out.print(i + " ");
            }

        }

    }
}
