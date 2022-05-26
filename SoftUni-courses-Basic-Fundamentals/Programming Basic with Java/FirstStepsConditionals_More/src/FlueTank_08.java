
import java.util.Scanner;

public class FlueTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        if ((fuel.equals("Gasoline")) || (fuel.equals("Gas")) || (fuel.equals("Diesel"))) {
            int leftLiters = Integer.parseInt(scanner.nextLine());
            if (leftLiters >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase());}
        }  else   {
            System.out.println("Invalid fuel!");
        }

    }
     }

