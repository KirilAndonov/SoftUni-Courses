import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;


public class VehicleCatalogue_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Catalogue> vehicles = new ArrayList<>();
        while (!line.equals("End")) {
            String[] info = line.split(" ");
            Catalogue catalogue = new Catalogue(info[0], info[1], info[2], Integer.parseInt(info[3]));
            vehicles.add(catalogue);
            line = scanner.nextLine();
        }
        String lineTwo = scanner.nextLine();
        while (!lineTwo.equals("Close the Catalogue")) {
            String model = lineTwo;
            vehicles.stream().filter(catalogue -> catalogue.getModel().equals(model))
                    .forEach(catalogue -> System.out.println(catalogue.toString()));
            lineTwo = scanner.nextLine();
        }
        List<Catalogue> cars = vehicles.stream().filter(catalogue -> catalogue.getType().equals("car")).collect(Collectors.toList());
        List<Catalogue> trucks = vehicles.stream().filter(catalogue -> catalogue.getType().equals("truck")).collect(Collectors.toList());
        double carsAverageHp = avHp(cars);
        double trucksAverageHp = avHp(trucks);
        System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHp);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksAverageHp);
    }

    static double avHp(List<Catalogue> vehicles) {
        if (vehicles.size() == 0) {
            return 0;
        }
        return vehicles.stream().mapToDouble(Catalogue::getHp).sum() / vehicles.size();
    }

    public static class Catalogue {
        String type;
        String model;
        String color;
        int hp;

        public Catalogue(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getModel() {
            return model;
        }

        public String getType() {
            return type;
        }

        public int getHp() {
            return hp;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                            "Model: %s%n" +
                            "Color: %s%n" +
                            "Horsepower: %d", getType().toUpperCase().charAt(0) + getType().substring(1), this.model,
                    this.color, this.hp);
        }
    }
}
