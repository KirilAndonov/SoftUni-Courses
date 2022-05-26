import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersA = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersB = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < Math.min(numbersA.size(), numbersB.size()); i++) {
            int a = numbersA.get(i);
            int b = numbersB.get(i);
            mergedList.add(a);
            mergedList.add(b);
        }
        if (numbersA.size() > numbersB.size()) {
            mergedList.addAll(getTheRemainingNumbers(numbersA, numbersB));
        } else if (numbersB.size() > numbersA.size()) {
            mergedList.addAll(getTheRemainingNumbers(numbersB, numbersA));
        }
        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> getTheRemainingNumbers(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> leftNumbers = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            leftNumbers.add(longerList.get(i));
        }
        return leftNumbers;
    }

}
