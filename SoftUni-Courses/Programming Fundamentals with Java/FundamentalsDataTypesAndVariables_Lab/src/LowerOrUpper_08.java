import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);
        if (input >= 'A' && input <= 'Z'){
            System.out.println("upper-case");
        }else if(input >= 'a' && input <= 'z'){
            System.out.println("lower-case");
        }


    }
}
