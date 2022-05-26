import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String command = scanner.nextLine();
       int firstNum = Integer.parseInt(scanner.nextLine());
       int secondNum = Integer.parseInt(scanner.nextLine());
       switch (command){
           case "add":
               addTwoNumbers(firstNum, secondNum);
               break;
           case "subtract":
               subtractTwoNumbers(firstNum, secondNum);
               break;
           case "multiply":
               multiplyTwoNumbers(firstNum, secondNum);
               break;
           case "divide":
               divideTwoNumbers(firstNum,secondNum);
       }
    }

    private static void divideTwoNumbers(int a, int b) {
        System.out.println(a / b);
    }

    private static void multiplyTwoNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    private static void subtractTwoNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    private static void addTwoNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
