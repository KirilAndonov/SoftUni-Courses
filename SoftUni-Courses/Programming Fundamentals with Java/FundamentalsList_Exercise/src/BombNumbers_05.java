import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] bombData = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bomb = bombData[0];
        int power = bombData[1];
        while (integerList.contains(bomb)) {
            int bombIndex = integerList.indexOf(bomb);
            int start = bombIndex - power;
            if (start < 0) {
                start = 0;
            }
            int end = bombIndex + power;
            if (end >= integerList.size()) {
                end = integerList.size() - 1;
            }
            for (int i = start; i <= end; i++) {
                integerList.remove(start);
            }

        }
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
