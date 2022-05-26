import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> positiveNumbers = new ArrayList<>();
        int positive = 0;
        int negativeCounter = 0;
        for (Integer number : numbers) {
            if (number > positive) {
                positiveNumbers.add(number);
            } else {
                negativeCounter++;
            }
        } if(negativeCounter == numbers.size()){
            System.out.println("empty");
        }
        Collections.reverse(positiveNumbers);
        System.out.println(positiveNumbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
