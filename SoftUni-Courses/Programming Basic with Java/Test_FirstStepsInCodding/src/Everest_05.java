import java.util.Scanner;

public class Everest_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int counter = 1;
        int totalMeters = 5364;

        while (!command.equals("END")){
            String sleepOrNo = command;
            int meters = Integer.parseInt(scanner.nextLine());

            if(sleepOrNo.equals("Yes")){
                counter++;
                if (counter > 5){
                    break;
                }
               else { totalMeters = totalMeters + meters;}
            }else if(command.equals("No")){
                totalMeters = totalMeters + meters;
            }
            if(totalMeters >= 8848){

                break;
            }

            command = scanner.nextLine();
        }
        if (totalMeters >= 8848){

            System.out.printf("Goal reached for %d days!", counter);
        } else {
            System.out.println("Failed!");
            System.out.println(totalMeters);
        }
    }
}
