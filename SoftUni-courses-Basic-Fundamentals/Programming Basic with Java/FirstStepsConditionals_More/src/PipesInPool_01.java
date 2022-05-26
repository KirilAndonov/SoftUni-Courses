import java.util.Scanner;
public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volumePool = Integer.parseInt(scanner.nextLine());
        int firstPipeDebit = Integer.parseInt(scanner.nextLine());
        int secoundPipeDebit = Integer.parseInt(scanner.nextLine());
        double hoursWorkerLeft = Double.parseDouble(scanner.nextLine());
        double debitFirstPipe = firstPipeDebit * hoursWorkerLeft;
        double debitSceundPipe = secoundPipeDebit * hoursWorkerLeft;
        double totalDebitFromPipes = debitFirstPipe + debitSceundPipe;
        double diff = (totalDebitFromPipes / volumePool) * 100;
        double diffPipeOne = (debitFirstPipe / totalDebitFromPipes) * 100;
        double diffPipeTwo = (debitSceundPipe / totalDebitFromPipes) * 100;
        double moreLiters = Math.abs(totalDebitFromPipes - volumePool);
        if (totalDebitFromPipes <= volumePool){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", diff, diffPipeOne, diffPipeTwo);}
        else {
            System.out.printf("For %.2f hours the pool overflows with %.02f liters.", hoursWorkerLeft, moreLiters);
        }



    }
}
