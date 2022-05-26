
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        Map<Character, Integer> pairs = new LinkedHashMap<>();
        for (String txt : line) {
            for (int i = 0; i < txt.length(); i++) {
                char symbol = txt.charAt(i);
                        pairs.putIfAbsent(symbol, 0);
                        pairs.put(symbol, pairs.get(symbol) + 1);
            }
        }
        pairs.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
