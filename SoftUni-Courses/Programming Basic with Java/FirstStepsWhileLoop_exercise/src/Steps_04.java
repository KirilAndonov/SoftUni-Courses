import java.util.Scanner;

public class Steps_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int target = 10000;
        int totalSteps = 0;

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;
            if (totalSteps >= target){
                break;
            }

            input = scanner.nextLine();
        }
        if(input.equals("Going home")){
            int finalSteps = Integer.parseInt(scanner.nextLine());
            totalSteps = totalSteps + finalSteps;
        }

        if(totalSteps >= target){
        System.out.println("Goal reached! Good job!");
        System.out.printf("%d steps over the goal!", totalSteps - target);}
        else {
            System.out.printf("%d more steps to reach goal.", Math.abs(target - totalSteps));
        }
    }
}
