import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfBadGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int counterBadGrades = 0;
        int totalScore = 0;
        int totalSolvedTasks = 0;
        String lastTask = "";

        while (!command.equals("Enough")){
            String taskName = command;
            int gradeForTask = Integer.parseInt(scanner.nextLine());

            if(gradeForTask <= 4){
                counterBadGrades++;
            } if(counterBadGrades == numbersOfBadGrades){
                break;
            }

            totalScore = totalScore + gradeForTask;
            totalSolvedTasks++;
            lastTask = taskName;
            command = scanner.nextLine();

        }
if(counterBadGrades >= numbersOfBadGrades){
    System.out.printf("You need a break, %d poor grades.", counterBadGrades);}
else{
        System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", totalScore * 1.0 / totalSolvedTasks,
                totalSolvedTasks, lastTask);
}


    }
}
