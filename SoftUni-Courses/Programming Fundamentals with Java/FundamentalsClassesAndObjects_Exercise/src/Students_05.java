import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] studentInfo = scanner.nextLine().split(" ");
            Student student = new Student(studentInfo[0], studentInfo[1], Double.parseDouble(studentInfo[2]));
            students.add(student);
        }
        students.stream().sorted((s1, s2) -> Double.compare(s2.getAge(), s1.getAge()))
                .forEach(s -> System.out.println(s.toString()));
    }
    public static class Student{
        String firstName;
        String lastName;
        double age;

         Student(String firstName, String lastName, double age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public double getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.age);
        }
    }
}
