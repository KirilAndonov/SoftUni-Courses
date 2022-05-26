import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < numberCommands; i++) {
            String line = scanner.nextLine();
            String [] data = line.split(" ");
            String name = data[0];
            if(!line.contains("not")){
                if(guests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    guests.add(name);
                }
            }else {
                if(guests.contains(name)){
                    guests.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        guests.forEach(System.out::println);

    }
}