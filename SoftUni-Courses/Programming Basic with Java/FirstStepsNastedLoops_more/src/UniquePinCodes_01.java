import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int borderFirstNum = Integer.parseInt(scanner.nextLine());
        int borderSecondNum = Integer.parseInt(scanner.nextLine());
        int borderThirdNum = Integer.parseInt(scanner.nextLine());

        //•	Първата и третата цифра трябва да бъдат четни.
        //•	Втората цифра трябва да бъде просто число в диапазона [2...7].
        for (int i = 1; i <= borderFirstNum ; i++) {
            for (int j = 1; j <= borderSecondNum ; j++) {
                int count = 0;
                int countTwo = 0;
                if(j == 1){
                    continue;
                }
                if(j > 7){
                    break;
                }
                if(j == 2){
                    countTwo++;
                }else if(j % 2 != 0){
                    count++;
                }
                for (int k = 1; k <= borderThirdNum ; k++) {
                    if(i % 2 == 0 && k % 2 == 0){
                        if (count == 1 || countTwo == 1){
                            System.out.print(i + " " + j + " " + k);
                            System.out.println();
                        }
                    }

                }

            }

        }
    }
}