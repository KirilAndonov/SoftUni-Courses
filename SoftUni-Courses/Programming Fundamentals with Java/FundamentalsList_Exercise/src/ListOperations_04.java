import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] command = line.split("\\s+");
            switch (command[0]) {
                case "Add":
                    integerList.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) < 0 || Integer.parseInt(command[2]) >= integerList.size()) {
                        System.out.println("Invalid index");
                    } else integerList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    int index = Integer.parseInt(command[1]);
                    if (index < 0 || index >= integerList.size()) {
                        System.out.println("Invalid index");
                    }else integerList.remove(index);
                    break;
                case "Shift":
                    if (command[1].equals("left")) {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            integerList.add(integerList.get(0));
                            integerList.remove(0);

                        }
                    } else if (command[1].equals("right")) {
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            integerList.add(0, integerList.get(integerList.size() - 1));
                            integerList.remove(integerList.size() - 1);
                        }
                    }
            }
            line = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}