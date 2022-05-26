import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
       totalSum(product, quantity);

    }

    private static void totalSum(String product, int quantity) {
        switch (product){
            case "coffee":
                double result = quantity * 1.50;
                System.out.printf("%.2f", result);
                break;
            case "water":
                double result1 = quantity * 1.00;
                System.out.printf("%.2f", result1);
                break;
            case "coke":
                double result2 = quantity * 1.40;
                System.out.printf("%.2f", result2);
                break;
            case "snacks":
                double result3 = quantity * 2.00;
                System.out.printf("%.2f", result3);
                break;
        }
    }
}
