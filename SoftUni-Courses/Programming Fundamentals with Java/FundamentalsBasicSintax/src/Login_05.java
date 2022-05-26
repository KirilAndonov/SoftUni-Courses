import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        String input = scanner.nextLine();
        int tries = 0;

         while (!input.equals(password)) {
            tries++;
            if(tries == 4){
             System.out.printf("User %s blocked!", username);
             break;
         }
            System.out.println("Incorrect password. Try again.");

             input = scanner.nextLine();
         }
      if(input.equals(password)){
          System.out.printf("User %s logged in.", username);}
    }
}
