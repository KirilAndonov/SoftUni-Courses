import java.util.Scanner;

public class commonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length ; i++) {
            String current = secondArray[i];
            for (int j = 0; j < firstArray.length; j++) {
                String currentFirst = firstArray[j];
                if (current.equals(currentFirst)){
                    System.out.print(current + " ");
                }

            }
        }
    }
}
