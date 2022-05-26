import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<Double>> pairs = new LinkedHashMap<>();
        while (!command.equals("buy")) {
            String[] line = command.split(" ");
            String item = line[0];
            double price = Double.parseDouble(line[1]);
            double quantity = Double.parseDouble(line[2]);
           if(pairs.containsKey(item)){
               
           }


            command = scanner.nextLine();
        }
    }
}
