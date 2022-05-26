import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int step = 0; step <= number; step++){
            if (step % 2 == 0){
                System.out.println(Math.pow(2, step));
            }
        }

    }
}
