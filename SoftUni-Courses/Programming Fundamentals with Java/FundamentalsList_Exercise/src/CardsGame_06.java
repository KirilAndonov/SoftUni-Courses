import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < firstPlayer.size(); i++) {
            if (firstPlayer.size() != 0 && secondPlayer.size() != 0) {
                if (firstPlayer.get(i) > secondPlayer.get(i)) {
                    firstPlayer.add(firstPlayer.get(i));
                    firstPlayer.add(secondPlayer.get(i));
                    secondPlayer.remove(i);
                    firstPlayer.remove(i);
                    i--;
                } else if (firstPlayer.get(i).equals(secondPlayer.get(i))) {
                    firstPlayer.remove(i);
                    secondPlayer.remove(i);
                    i--;
                } else if (firstPlayer.get(i) < secondPlayer.get(i)) {
                    secondPlayer.add(secondPlayer.get(i));
                    secondPlayer.add(firstPlayer.get(i));
                    firstPlayer.remove(i);
                    secondPlayer.remove(i);
                    i--;
                }
            }
        }

        if (firstPlayer.size() <= 0) {
            for (Integer integer : secondPlayer) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (secondPlayer.size() <= 0) {
            for (Integer integer : firstPlayer) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }


    }
}
