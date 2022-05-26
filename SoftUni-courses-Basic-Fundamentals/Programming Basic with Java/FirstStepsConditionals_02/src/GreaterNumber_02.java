import java.util.Scanner;
public class GreaterNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете две цели числа, въведени от потребителя и отпечатва по-голямото от двете.
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        if (a > b) {
            System.out.println(a);
        }
        else  {
            System.out.println(b);
        }
    }
}