import java.util.Scanner;

public class Substitute_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int firstNumFirst = Integer.parseInt(scanner.nextLine());
int secondNumFirst = Integer.parseInt(scanner.nextLine());
int firstNumSecond = Integer.parseInt(scanner.nextLine());
int secondNumSecond = Integer.parseInt(scanner.nextLine());
int count = 0;

        for (int i = firstNumFirst; i <= 8 ; i++) {
            if(count >= 6){
                break;
            }
            for (int j = 9; j >= secondNumFirst ; j--) {
                if(count >= 6){
                    break;
                }
                for (int k = firstNumSecond; k <= 8 ; k++) {
                    if(count >= 6){
                        break;
                    }
                    for (int l = 9; l >= secondNumSecond ; l--) {

                        if(i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0){
                            if(i!=k || j != l){
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                count++;
                            }
                          else{  System.out.println("Cannot change the same player.");}

                        }

                        if(count >= 6){
                            break;
                        }

                    }

                }

            }

        }
    }
}
