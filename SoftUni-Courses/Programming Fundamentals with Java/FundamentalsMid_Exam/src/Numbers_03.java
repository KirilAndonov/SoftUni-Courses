import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int totalSum = 0;
        for (Integer integer : integerList) {
            totalSum += integer;
        }
        double averageValue = totalSum * 1.0 / integerList.size();
        if(integerList.size() == 1){
            System.out.println("No");
            return;
        }
        List<Integer> greaterThanAverage = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > averageValue) {
                greaterThanAverage.add(integerList.get(i));
            }
        }
        int count = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) <= averageValue){
                count++;
                if(count == integerList.size()){
                    System.out.println("No");
                    break;
                }
            }
        }
        int counter = 0;
        Collections.sort(greaterThanAverage);
        if (greaterThanAverage.size() >= 5) {
            List<Integer> topFive = new ArrayList<>();
            for (int i = greaterThanAverage.size() - 1; i >= 0; i--) {
                counter++;
                topFive.add(greaterThanAverage.get(i));
                if (counter >= 5) {
                    System.out.println(topFive.toString().replaceAll("[\\[\\],]", ""));
                    break;
                }
            }
        } else {
            Collections.reverse(greaterThanAverage);
            System.out.println(greaterThanAverage.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
