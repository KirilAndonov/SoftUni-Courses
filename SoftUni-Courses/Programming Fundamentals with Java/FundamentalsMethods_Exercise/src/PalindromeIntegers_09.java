import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String command = scanner.nextLine();
      while (!command.equals("END")){
          if(command.equals(reversedString(command))){
              System.out.println("true");
          }else {
              System.out.println("false");
          }
          command = scanner.nextLine();
      }
    }

    private static String reversedString(String command) {
        String reversedCommand = "";
        for (int i = command.length() - 1; i >= 0 ; i--) {
            char currentSymbol = command.charAt(i);
            reversedCommand += currentSymbol;
        }
        return reversedCommand;
    }
}
