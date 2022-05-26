import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] operation = line.split("\\s+");
            String command = operation[0];
            switch (command) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(operation[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (operation[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    } else if (operation[1].equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.printf("%d ", number);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sumAll = 0;
                    for (Integer number : numbers) {
                        sumAll += number;
                    }
                    System.out.printf("%d ", sumAll);
                    System.out.println();
                    break;
                case "Filter":
                    if (operation[1].equals(">")) {
                        for (Integer number : numbers) {
                            if (Integer.parseInt(operation[2]) < number)
                                System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                    if (operation[1].equals("<")) {
                        for (Integer number : numbers) {
                            if (Integer.parseInt(operation[2]) > number)
                                System.out.print(number + " ");
                        }
                        System.out.println();
                    } else if (operation[1].equals(">=")) {
                        for (Integer number : numbers) {
                            if (Integer.parseInt(operation[2]) <= number)
                                System.out.print(number + " ");
                        }
                        System.out.println();
                    } else if (operation[1].equals("<=")) {
                        for (Integer number : numbers) {
                            if (Integer.parseInt(operation[2]) >= number)
                                System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                    break;
            }
            line = scanner.nextLine();
        }
    }
}
