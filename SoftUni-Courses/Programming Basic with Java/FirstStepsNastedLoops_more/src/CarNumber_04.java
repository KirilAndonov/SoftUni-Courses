import java.util.Scanner;

public class CarNumber_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        //•	Ако номерът започва с четна цифра, то той трябва да завършва на нечетна цифра и обратното – ако започва с нечетна,  завършва на четна
        //•	Първата цифра от номера е по-голяма от последната
        //•	Сумата от втората и третата цифра трябва да е четно число

        for (int i = start; i <= finish ; i++) {
            for (int j = start; j <= finish ; j++) {
                for (int k = start; k <= finish ; k++) {
                    for (int l = start; l <= finish; l++) {
                        if((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0)){
                            if(i > l){
                                if((j + k) % 2 == 0){
                                    System.out.printf("%d%d%d%d ", i, j, k, l);

                                }
                            }
                        }

                    }

                }

            }

        }


    }
}
