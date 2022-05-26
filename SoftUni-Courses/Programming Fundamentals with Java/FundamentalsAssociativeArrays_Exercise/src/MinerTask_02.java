import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, Integer> pairs = new LinkedHashMap<>();
        while (!command.equals("stop")){
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            pairs.putIfAbsent(command, 0);
            pairs.put(command, pairs.get(resource) + quantity);
            command = scanner.nextLine();

        }
        pairs.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
