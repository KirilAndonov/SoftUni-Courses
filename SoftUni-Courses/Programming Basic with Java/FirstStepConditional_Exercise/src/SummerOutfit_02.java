import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();
String currentOutfit = "";
String currentShoes = "";
        switch (partOfDay){
            case "Morning":
                if(degrees >= 10 && degrees <= 18){
currentOutfit = "Sweatshirt";
currentShoes = "Sneakers";
                }else if (degrees > 18 && degrees <= 24){
currentOutfit = "Shirt";
                    currentShoes = "Moccasins";
                }else if (degrees >= 25){
currentOutfit = "T-Shirt";
                    currentShoes = "Sandals";
                }
              break;
            case "Afternoon":
                if(degrees >= 10 && degrees <= 18){
currentOutfit = "Shirt";
                    currentShoes = "Moccasins";
                }else if (degrees > 18 && degrees <= 24){
currentOutfit = "T-Shirt";
                    currentShoes = "Sandals";
                }else if (degrees >= 25){
currentOutfit = "Swim Suit";
                    currentShoes = "Barefoot";
                }
                break;
            case "Evening":
                if(degrees >= 10 && degrees <= 18){
currentOutfit = "Shirt";
                    currentShoes = "Moccasins";
                }else if (degrees > 18 && degrees <= 24){
currentOutfit = "Shirt";
                    currentShoes = "Moccasins";
                }else if (degrees >= 25){
currentOutfit = "Shirt";
                    currentShoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, currentOutfit, currentShoes);
    }
}
