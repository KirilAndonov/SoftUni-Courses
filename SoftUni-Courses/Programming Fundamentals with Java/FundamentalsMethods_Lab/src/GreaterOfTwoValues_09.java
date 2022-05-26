import java.util.Scanner;
public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type){
            case "int":
                int numberOne = Integer.parseInt(scanner.nextLine());
                int numberTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numberOne, numberTwo));
                break;
            case "char":
                char symbolOne = scanner.nextLine().charAt(0);
                char symbolTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbolOne, symbolTwo));
                break;
            case "string":
                String firstSymbol = scanner.nextLine();
                String secondSymbol = scanner.nextLine();
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
        }
    }

    private static String getMax(String firstSymbol, String secondSymbol) {
        if(firstSymbol != null){
        if(firstSymbol.compareTo(secondSymbol) >= 0){
            return firstSymbol;
        }}
        return secondSymbol;
    }

    private static char getMax(char symbolOne, char symbolTwo) {
        if(symbolOne > symbolTwo){
            return symbolOne;
        }
        return symbolTwo;
    }

    private static int getMax(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
}
