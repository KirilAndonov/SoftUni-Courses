import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int maxNumberPasswords = Integer.parseInt(scanner.nextLine());
        int counter=0;
        int counterA=35;
        int counterB=64;
        boolean stop=false;
        for(int i=1;i<=number1;i++){
            if(maxNumberPasswords<=counter){
                break;
            }


            for (int j=1;j<=number2;j++){
                if(maxNumberPasswords<=counter){
                    break;
                }
                stop=false;
                for(int k=counterA;k<=55;k++){
                    if(stop||counter>=maxNumberPasswords){
                        break;
                    }
                    counterA++;
                    if (counterA>55){
                        counterA=35;
                    }

                        System.out.printf("%c%c%d%d%c%c|",k,counterB,i,j,counterB,k);
                        counter++;
                        counterB++;
                        if(counterB>96){
                            counterB=64;
                        }
                        stop=true;
                        break;

                }
            }
        }

    }
}
