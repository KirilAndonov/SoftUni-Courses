import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int a = Integer.parseInt(scanner.nextLine());
int b = Integer.parseInt(scanner.nextLine());
int c = Integer.parseInt(scanner.nextLine());
int volume = a * b * c;
String command = scanner.nextLine();
int sumBoxes = 0;
while (!command.equals("Done")){
    int boxes  = Integer.parseInt(command);
sumBoxes = sumBoxes + boxes;
if(sumBoxes >= volume){
    break;
}

    command = scanner.nextLine();
}
if (sumBoxes >= volume){
    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume - sumBoxes));
}else {
    System.out.printf("%d Cubic meters left.", volume - sumBoxes);
}
    }
}
