import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printTheGradeResult(scanner);
    }

    private static void printTheGradeResult(Scanner scanner) {
        double grade = Double.parseDouble(scanner.nextLine());
        if(grade >= 2 && grade <= 2.99){
            System.out.println("Fail");
        }else if(grade >= 3 && grade <= 3.49){
            System.out.println("Poor");
        }else if(grade >= 3.50 & grade <= 4.49){
            System.out.println("Good");
        }else if(grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }else if(grade >= 5.50 & grade <= 6.00){
            System.out.println("Excellent");
        }
    }
}
