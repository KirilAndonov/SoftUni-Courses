import java.util.Scanner;

public class arrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < rotation ; i++) {
            String firstElement = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
             arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = firstElement;
        }
        System.out.println(String.join(" ", arr));
    }
}
