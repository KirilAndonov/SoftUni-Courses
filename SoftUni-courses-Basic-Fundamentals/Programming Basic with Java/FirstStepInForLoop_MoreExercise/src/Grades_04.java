import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsOnExam = Integer.parseInt(scanner.nextLine());
double totalGrade = 0;
int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= studentsOnExam ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGrade = totalGrade + grade;
            p5++;

            if(grade >= 2 && grade <= 2.99){
                p1++;

            }else if(grade <= 3.99){
                p2++;

            }else if(grade <= 4.99){
                p3++;

            }else {
                p4++;

            }
            
        }
        double averageGrade = totalGrade / p5;
        System.out.printf("Top students: %.2f%%%n", p4 * 1.0 / studentsOnExam * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", p3 * 1.0 / studentsOnExam * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", p2 * 1.0 / studentsOnExam * 100);
        System.out.printf("Fail: %.2f%%%n", p1 * 1.0 / studentsOnExam * 100);
        System.out.printf("Average: %.2f", averageGrade);

    }
}
