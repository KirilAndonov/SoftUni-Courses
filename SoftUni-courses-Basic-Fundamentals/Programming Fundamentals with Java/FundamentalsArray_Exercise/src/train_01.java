import java.util.Scanner;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfWagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[numOfWagons];
        int sum = 0;
        for (int i = 0; i < train.length ; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
            System.out.print(train[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
