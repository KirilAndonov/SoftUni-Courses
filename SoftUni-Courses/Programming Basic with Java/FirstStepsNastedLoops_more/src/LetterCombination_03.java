import java.util.Scanner;

public class LetterCombination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char start=scanner.nextLine().charAt(0);
        char end=scanner.nextLine().charAt(0);
        char console=scanner.nextLine().charAt(0);

        int startNumber=start;
        int endNumber=end;
        int consoleNumber=console;
        int counter=0;

        for(int i=startNumber;i<=endNumber;i++){
            if(i==consoleNumber){
                continue;
            }
            for(int j=startNumber;j<=endNumber;j++){
                if(j==consoleNumber){
                    continue;
                }
                for(int k=startNumber;k<=endNumber;k++){
                    if(k==consoleNumber){
                        continue;
                    }
                    counter++;
                    System.out.printf("%c%c%c ",i,j,k);

                }
            }


        }
        System.out.println(counter);
    }
}
