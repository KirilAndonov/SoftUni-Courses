import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] command = line.split(" ");
            switch (command[0]) {
                case "swap":
                    int numberToSlap = numbers.get(Integer.parseInt(command[1]));
                    numbers.set(Integer.parseInt(command[1]), numbers.get(Integer.parseInt(command[2])));
                    numbers.set(Integer.parseInt(command[2]), numberToSlap);
                    break;
                case "multiply":
                    int firstNumber = numbers.get(Integer.parseInt(command[1]));
                    int secondNumber = numbers.get(Integer.parseInt(command[2]));
                    int sumOfTheTwo = firstNumber * secondNumber;
                    numbers.set(Integer.parseInt(command[1]), sumOfTheTwo);
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i) - 1);
                    }
                    break;
            }
            line = scanner.nextLine();
        }
System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
