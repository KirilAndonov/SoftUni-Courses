import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfJury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
double counterTotalGrades = 0;
double totalSumOfGrades = 0;

        while (!command.equals("Finish")){
            double sumOfGrades = 0;
            double countGrades = 0;
            for (int i = 1; i <= numberOfJury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                counterTotalGrades++;
                sumOfGrades = sumOfGrades + grade;
                totalSumOfGrades = totalSumOfGrades + grade;
            }
            System.out.printf("%s - %.2f.%n", command, sumOfGrades / countGrades);
            command = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.%n", totalSumOfGrades / counterTotalGrades);

    }
}
