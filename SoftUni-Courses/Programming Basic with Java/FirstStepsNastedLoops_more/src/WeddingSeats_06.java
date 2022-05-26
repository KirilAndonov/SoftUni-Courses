import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int numberOfRowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int numberOfSeatsInOddRows = Integer.parseInt(scanner.nextLine());

        char firstSector = 'A';
        int lastNumSector = lastSector;
int count = 0;
        for (int sector = firstSector; sector <= lastNumSector ; sector++) {
            for (int rows = 1; rows <= numberOfRowsInFirstSector; rows++) {
                if(rows % 2 == 0){
                    for (int i = 1; i <= numberOfSeatsInOddRows+2 ; i++) {
                        System.out.printf("%c%d%c%n", sector, rows, (i + 96));
                        count++;
                    }
                }else {
                    for (int i = 1; i <= numberOfSeatsInOddRows ; i++) {
                        System.out.printf("%c%d%c%n", sector, rows, (i + 96));
                        count++;
                    }
                }
            }
numberOfRowsInFirstSector++;
        }
        System.out.println(count);
    }
}
