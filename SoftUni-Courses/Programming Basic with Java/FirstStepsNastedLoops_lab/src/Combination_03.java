import java.util.Scanner;

public class Combination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int count = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int x1 = 0; x1 <= n ; x1++) {
            for (int x2 = 0; x2 <= n ; x2++) {
                for (int x3 = 0; x3 <= n ; x3++) {
                    int sum = x1 + x2 + x3;

                    if(sum == n){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
