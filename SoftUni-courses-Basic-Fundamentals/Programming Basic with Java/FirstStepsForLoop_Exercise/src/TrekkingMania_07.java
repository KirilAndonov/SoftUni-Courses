import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());

int peopleMusala = 0;
int peopleMonblan = 0;
int peopleKiliman = 0;
int peoplek2 = 0;
int everest = 0;
int totalPeople = 0;
        for (int i = 1; i <= groupNumber ; i++) {
            int peopleNumber = Integer.parseInt(scanner.nextLine());
            totalPeople = totalPeople + peopleNumber;
            if (peopleNumber <= 5){
                peopleMusala = peopleMusala + peopleNumber;
            }else if(peopleNumber <= 12){
                peopleMonblan = peopleMonblan + peopleNumber;
            }else if(peopleNumber <= 25){
                peopleKiliman = peopleKiliman + peopleNumber;
            }else if (peopleNumber <= 40){
                peoplek2 = peoplek2 + peopleNumber;
            }else {
                everest = everest + peopleNumber;
            }
        }

        System.out.printf("%.2f%%%n", peopleMusala * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", peopleMonblan * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", peopleKiliman * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", peoplek2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", everest * 1.0 / totalPeople * 100);

    }
}
