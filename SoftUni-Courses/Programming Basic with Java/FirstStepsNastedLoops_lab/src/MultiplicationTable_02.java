public class MultiplicationTable_02 {
    public static void main(String[] args) {
        for (int first = 1; first <= 10 ; first++) {
            for (int second = 1; second <= 10 ; second++) {
                int sum = first * second;
                System.out.printf("%d * %d = %d%n", first, second, sum);

            }
        }
    }
}
