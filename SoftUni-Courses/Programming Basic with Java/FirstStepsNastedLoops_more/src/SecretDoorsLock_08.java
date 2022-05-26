import java.util.Scanner;

public class SecretDoorsLock_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int ones = Integer.parseInt(scanner.nextLine());

        for (int hundred = 1; hundred <= hundreds ; hundred++) {
            for (int ten = 2; ten <= tens ; ten++) {
                for (int one = 1; one <= ones ; one++) {
                    if(ten > 7){
                        break;
                    }
               if(hundred % 2 == 0 && one % 2 == 0){
                   if (ten == 2){
                       System.out.printf("%d %d %d%n", hundred, ten, one);
                   } if(ten % 2 != 0){
                       System.out.printf("%d %d %d%n", hundred, ten, one);
                   }
               }

                }

            }

        }


    }
}
