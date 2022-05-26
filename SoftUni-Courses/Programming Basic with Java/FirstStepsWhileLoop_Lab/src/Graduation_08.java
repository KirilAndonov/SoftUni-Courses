import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double totalGrade = 0;
        int counterClasses = 0;
        int lowGrades = 0;

        while (counterClasses != 12) {

            double yearGrade = Double.parseDouble(scanner.nextLine());
            if(yearGrade < 4){
                lowGrades++;
                if(lowGrades > 1){
                    break;
                }
            }
            totalGrade = totalGrade + yearGrade;
            counterClasses++;
        }
        if (counterClasses == 12){
            System.out.printf("%s graduated. Average grade: %.2f", name, totalGrade / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, counterClasses);
        }

    }
}
