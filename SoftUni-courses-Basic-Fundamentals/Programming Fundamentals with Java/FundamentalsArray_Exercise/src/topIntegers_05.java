import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class topIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxNum = Integer.MIN_VALUE;
        ArrayList test = new ArrayList();
        if(line == null || line.length == 0){
            return;
        }
        for (int i = line.length - 1; i >= 0 ; i--) {
            if(line[i] >= maxNum){
                maxNum = line[i];

                test.add(line[i]);
            }
        }
        for (int i = test.size() - 1; i >= 0  ; i--) {
            System.out.print(test.get(i) + " ");
        }



    }
}



