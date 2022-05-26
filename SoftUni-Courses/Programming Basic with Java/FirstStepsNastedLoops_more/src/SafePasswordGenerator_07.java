import java.util.Scanner;

public class SafePasswordGenerator_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxNumPassword = Integer.parseInt(scanner.nextLine());

        int countA = 35;
        int countB = 64;
        int count = 0;
        boolean stop = false;

        for (int x = 1; x <= a ; x++) {
            if(count >= maxNumPassword){
                break;
            }
            for (int y = 1; y <= b ; y++) {
                if(count >= maxNumPassword){
                    break;
                }
                stop = false;
                for (int A = countA; A <= 55 ; A++) {
                    if(stop || count >= maxNumPassword){
                        break;
                    }
                    countA++;
                    if(countA > 55){
                        countA = 35;
                    }
                    for (int B = countB; B <= 96 ; B++) {
                        if(count >= maxNumPassword){
                            break;
                        }
                        System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                        countB++;
                        if(countB > 96){
                            countB = 64;
                        }
                        count++;
                        stop = true;
                        break;
                    }
                }
            }
        }



    }
}