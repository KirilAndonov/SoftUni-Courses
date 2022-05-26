import java.util.Scanner;

public class SumEvenNum_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String lineOfNumbers = scanner.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split("\\s+");
   int even = 0;
        for (int i = 0; i < numbersAsStrings.length; i++) {
            int number = Integer.parseInt(numbersAsStrings[i]);
            if (number % 2 == 0){
                even += number;
            }
        }
        System.out.println(even);
    }
}
