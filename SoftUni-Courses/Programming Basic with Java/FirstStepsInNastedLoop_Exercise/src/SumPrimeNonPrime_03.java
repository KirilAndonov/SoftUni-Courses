import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int nonPrime = 0;
        int primeNumbers = 0;
        while (!command.equals("stop")){
            int currentNumber = Integer.parseInt(command);
            if(currentNumber < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNumber ; i++) {
                if(currentNumber % i == 0){
                    count++;
                }
            }

            if(count == 2){
                primeNumbers = primeNumbers + currentNumber;
            }else{
                nonPrime = nonPrime + currentNumber;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrime);

    }
}
