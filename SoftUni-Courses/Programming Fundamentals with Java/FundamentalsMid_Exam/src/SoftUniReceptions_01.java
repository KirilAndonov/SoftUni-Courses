import java.util.Scanner;

public class SoftUniReceptions_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployCanHandle = Integer.parseInt(scanner.nextLine());
        int secondEmployCanHandle = Integer.parseInt(scanner.nextLine());
        int thirdEmployCanHandle = Integer.parseInt(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

int studentsPerHour = firstEmployCanHandle + secondEmployCanHandle + thirdEmployCanHandle;
int neededTime = 0;
while (numberOfStudents > 0){

        neededTime++;
        if(neededTime % 4 != 0){
        numberOfStudents -= studentsPerHour;
    }

}



        System.out.printf("Time needed: %dh.", neededTime);
    }
}
