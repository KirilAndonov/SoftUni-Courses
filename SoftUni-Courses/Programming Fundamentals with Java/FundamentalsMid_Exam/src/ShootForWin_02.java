import java.util.Arrays;
import java.util.Scanner;

public class ShootForWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String line = scanner.nextLine();
        //24 50 36 70
        //0
        //4
        //3
        //1
        int shot = 0;
        while (!line.equals("End")) {
            int indices = Integer.parseInt(line);
            if (indices < targets.length) {
                int shotTarget = targets[indices];
                if (shotTarget != -1) {
                    shot++;
                    targets[indices] = -1;

                   registerTargetHit(targets, shotTarget);
                }
            }


            line = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shot);
        for (int target : targets) {
            System.out.print(target + " ");
        }


    }

    private static void registerTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if(targets[i] != -1){
            if(targets[i] > shotTarget){
                targets[i] -= shotTarget;
            }else {
                targets[i] += shotTarget;
            }}
        }
        System.out.println();
    }
}
