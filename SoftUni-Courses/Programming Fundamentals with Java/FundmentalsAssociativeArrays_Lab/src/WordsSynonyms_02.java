import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < lines; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            words.putIfAbsent(key, new ArrayList<>());
            words.get(key).add(value);
        }
        int count = 0;
        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            for (String word : entry.getValue()) {
                count++;
                System.out.print(word);
                if (count <= entry.getValue().size()){
                        System.out.print(", ");
                    }

            }
            System.out.println();
        }
    }
}
