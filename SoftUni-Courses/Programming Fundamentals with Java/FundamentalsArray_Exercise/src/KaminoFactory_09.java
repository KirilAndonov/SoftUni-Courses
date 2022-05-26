import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfDna = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int bestSequence = 0;
        int newBestSequence = 0;
        int counter = 1;
        int sum = 0;
        while (!command.equals("Clone them!")){
            int[] dna = Arrays
            .stream(command.split("!"))
            .mapToInt(Integer::parseInt)
            .toArray();
            for (int i = 1; i < dna.length; i++) {
                if(dna[i] == dna[i - 1]){
                    counter++;
                    if(counter > bestSequence){
                        bestSequence = counter;
                        for (int j = 0; j < dna.length; j++) {
                            sum += dna[i];
                        }
                    }
                }else counter = 1;
            }
            command = scanner.nextLine();
        }

        System.out.println();
    }
}
