
import java.util.Scanner;

public class zigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
       String[] firsArray = new String[n];
       String[] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
         String [] currentLine = scanner.nextLine().split(" ");
            if(i % 2 == 0){
                secondArray[i - 1] = currentLine[0];
                firsArray[i - 1] = currentLine[1];
            } else {
                firsArray[i - 1] = currentLine[0];
                secondArray[i - 1] = currentLine[1];

            }
        }
        for (String s : firsArray) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : secondArray) {
            System.out.print(s + " ");
        }
    }
}
