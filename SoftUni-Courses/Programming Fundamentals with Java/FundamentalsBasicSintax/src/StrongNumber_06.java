import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int numberForIteration = Integer.parseInt(input);
        int num = numberForIteration;
        int allDigits = 0;

        for (int i = 0; i < input.length() ; i++) {
           int digit = numberForIteration % 10;
           numberForIteration /= 10;
           int fact = 1;
            for (int j = 1; j <= digit ; j++) {
             fact *= j;
            }
            allDigits += fact;
        }

if (num == allDigits){
    System.out.println("yes");
}else {
    System.out.println("no");

}



        }
}

