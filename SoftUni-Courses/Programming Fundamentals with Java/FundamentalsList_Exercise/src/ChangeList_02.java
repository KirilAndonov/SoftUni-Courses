import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] command = line.split(" ");
            String action = command[0];
            switch (action) {
                case "Delete":
                    for (int i = 0; i < integerList.size(); i++) {
                        if (integerList.get(i) == Integer.parseInt(command[1])) {
                            integerList.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    integerList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }


            line = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
    }
}
