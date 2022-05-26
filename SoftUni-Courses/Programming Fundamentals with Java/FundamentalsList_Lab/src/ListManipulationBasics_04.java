import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
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
            switch (command){
                case "Add":
                numbers.add(Integer.parseInt(operation[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(operation[1]));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(operation[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                  numbers.add(Integer.parseInt(operation[2]), Integer.parseInt(operation[1]));
                    break;
            }

            line = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
