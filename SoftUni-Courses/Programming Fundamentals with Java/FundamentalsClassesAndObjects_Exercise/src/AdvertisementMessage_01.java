import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<People> person = new ArrayList<>();
        while (!line.equals("End")) {
        String [] info = line.split(" ");
        People people = new People(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]));
        person.add(people);
            line = scanner.nextLine();
        }
        person.stream().sorted((p1, p2) -> Integer.compare(p1.age, p2.age))
                .forEach(p -> System.out.println(p.toString()));
    }
    public static class People{
        String name;
        int id;
        int age;

        public People(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
return String.format("%s with ID: %d is %d years old.", this.name, this.id, this.age);
        }
    }
}
