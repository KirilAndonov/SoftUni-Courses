import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] command = line.split(" ");
            if (command[0].equals("Add")) {
                integerList.add(Integer.parseInt(command[1]));
            } else {
                int countPeople = Integer.parseInt(command[0]);
                for (int i = 0; i < integerList.size(); i++) {
                    int currentPeople = integerList.get(i);
                    if (countPeople + currentPeople <= maxCapacity) {
                        integerList.set(i, countPeople + currentPeople);
                        break;
                    }
                }
            }


            line = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
