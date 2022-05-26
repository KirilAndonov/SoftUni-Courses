import java.util.Scanner;

public class FootballLeague_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityStadion = Integer.parseInt(scanner.nextLine());
        int fenNumber = Integer.parseInt(scanner.nextLine());

        int teamA = 0;
        int teamB = 0;
        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;

        for (int i = 1; i <= fenNumber ; i++) {
            String sector = scanner.nextLine();
            switch (sector){
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
            teamA = teamA + a + b;
            teamB = teamB + v + g;

        }

        System.out.printf("%.2f%%%n", a * 1.0 / fenNumber * 100);
        System.out.printf("%.2f%%%n", b * 1.0 / fenNumber * 100);
        System.out.printf("%.2f%%%n", v * 1.0 / fenNumber * 100);
        System.out.printf("%.2f%%%n", g * 1.0 / fenNumber * 100);
        System.out.printf("%.2f%%%n", fenNumber * 1.0 / capacityStadion * 100);


    }
}
