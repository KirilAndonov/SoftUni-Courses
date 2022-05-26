import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int notExam = 0;
        int exam = 0;

        for (int i = 1; i <= period; i++) {
            int people = Integer.parseInt(scanner.nextLine());


            if ((i % 3 == 0) && (notExam > exam)) {
                doctors++;}
                if (people > doctors) {
                    notExam = notExam + (people - doctors);
                    exam = exam + doctors;
                } else {
                    exam = exam + people;
                }
              }
            System.out.printf("Treated patients: %d.%n", exam);
            System.out.printf("Untreated patients: %d.", notExam);
        }
    }




