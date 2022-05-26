import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
int max = Integer.MIN_VALUE;
        while (!command.equals("Stop")){
            int number = Integer.parseInt(command);
            if(number > max){
                max = number;}
            command = scanner.nextLine();
        }
        System.out.println(max);

    }
}
