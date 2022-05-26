import java.util.Scanner;

public class FruitOrVegetable_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfProduct = scanner.nextLine();
        //banana, apple, kiwi, cherry, lemon и grapes
        //tomato, cucumber, pepper и carrot

        switch (nameOfProduct){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }

    }
}
