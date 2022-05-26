import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> productList =
                Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList
                        ());
        String line = scanner.nextLine();
        while (!line.equals("Go Shopping!")) {
            String[] command = line.split(" ");
            switch (command[0]) {
                case "Urgent":
                    if (!productList.contains(command[1])) {
                        productList.add(0, command[1]);
                    }
                    break;
                case "Unnecessary":
                    if (productList.contains(command[1])) {
                        productList.remove(command[1]);
                    }
                    break;
                case "Correct":
                    if (productList.contains(command[1])) {
                        productList.set(productList.indexOf(command[1]), command[2]);
                    }
                    break;
                case "Rearrange":
                    if (productList.contains(command[1])) {
                        productList.remove(command[1]);
                        productList.add(command[1]);
                    }
                    break;
            }


            line = scanner.nextLine();
        }
        System.out.println(productList.toString().replaceAll("[\\[\\]]", ""));


    }
}
