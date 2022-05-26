import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pairs = new LinkedHashMap<>();
        pairs.put("shards", 0);
        pairs.put("fragments", 0);
        pairs.put("motes", 0);
        boolean isWinner = false;
        String winner = "";
        while (!isWinner) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int i = 0; i < line.length - 1; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();
                pairs.putIfAbsent(material, 0);
                pairs.put(material, pairs.get(material) + quantity);
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (pairs.get(material) >= 250) {
                        pairs.put(material, pairs.get(material) - 250);
                        winner = material;
                        isWinner = true;
                        break;
                    }
                }
            }
        }
            switch (winner) {
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            pairs.forEach((k, v) -> System.out.printf("%s: %d%n", k, v));

    }
}
