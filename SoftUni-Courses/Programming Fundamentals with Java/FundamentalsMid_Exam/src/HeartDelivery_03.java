import java.util.Arrays;
        import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houses = Arrays
                .stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String line = scanner.nextLine();
        //10@10@10@2
        int currentPosition = 0;
        while (!line.equals("Love!")){
            String [] command = line.split(" ");
            int jumpPower = Integer.parseInt(command[1]);
            currentPosition += jumpPower;
            if(currentPosition >= houses.length){
                currentPosition = 0;
            }
            if(houses[currentPosition] > 0){
                houses[currentPosition] -= 2;
                if(houses[currentPosition] == 0){
                    System.out.printf("Place %d has Valentine's day.%n", currentPosition);
                }
            }else {
                System.out.printf("Place %d already had Valentine's day.%n", currentPosition);
            }


            line = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);
        int failed = 0;
        for (int house : houses) {
            if (house != 0) {
                failed++;
            }
        }
        if(failed > 0){
            System.out.printf("Cupid has failed %d places. %n", failed);
        }else {
            System.out.println("Mission was successful.");
        }

    }
}
