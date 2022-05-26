import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packagesForDogs = Integer.parseInt(scanner.nextLine());
        int packagesForCats = Integer.parseInt(scanner.nextLine());
        double priceForDogs = 2.5;
        int priceForCats = 4;
  double sum = (packagesForDogs * priceForDogs) + (packagesForCats * priceForCats);
        System.out.println(sum + " lv. ");






    }
}
