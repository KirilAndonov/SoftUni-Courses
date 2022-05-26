import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
int totalCake = wight * length;
int takenPieces = 0;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            int numberOfPieces = Integer.parseInt(input);
            takenPieces = takenPieces + numberOfPieces;
            if(takenPieces > totalCake){
                break;
            }
            input = scanner.nextLine();
        }

if (takenPieces > totalCake){
    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(takenPieces - totalCake));
}else {
    System.out.printf("%d pieces are left.", totalCake - takenPieces);
}

    }
}
