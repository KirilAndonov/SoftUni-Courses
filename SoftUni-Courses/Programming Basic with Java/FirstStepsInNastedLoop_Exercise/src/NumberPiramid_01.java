import java.util.Scanner;

public class NumberPiramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
int count = 0;
boolean flag = false;
        for (int rols = 1; rols <= n ; rols++) {
            for (int colun = 1; colun <= rols ; colun++) {
                count++;

                if(count > n){
                    flag = true;
                    break;
                }
                System.out.print(count + " ");
            }
            if(flag){
                break;
            }

            System.out.println();

        }

    }
}

