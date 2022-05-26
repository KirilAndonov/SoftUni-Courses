import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        printCharsBetweenTwoSymbols(firstSymbol, secondSymbol);
    }

    private static void printCharsBetweenTwoSymbols(char firstSymbol, char secondSymbol) {
        if(firstSymbol > secondSymbol){
            char temp = firstSymbol;
            firstSymbol = secondSymbol;
            secondSymbol = temp;
        }
        for (int i = firstSymbol + 1; i < secondSymbol ; i++) {
            System.out.printf("%c ", i);
        }
    }
}
