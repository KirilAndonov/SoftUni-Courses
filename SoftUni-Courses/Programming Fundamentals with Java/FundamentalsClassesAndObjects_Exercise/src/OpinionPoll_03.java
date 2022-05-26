import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            Person person = new Person(line[0], Integer.parseInt(line[1]));
            people.add(person);
        }
        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() > 30)
                .forEach(p -> System.out.println(p.toString()));
    }

    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }
}
