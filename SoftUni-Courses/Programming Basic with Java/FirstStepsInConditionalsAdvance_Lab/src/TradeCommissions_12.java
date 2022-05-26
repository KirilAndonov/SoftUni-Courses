import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double volumeSales = Double.parseDouble(scanner.nextLine());
double commission = 0.00;

        if(volumeSales >= 0 && volumeSales <= 500){
            if (town.equals("Sofia")){
                commission = volumeSales * 0.05;
            System.out.printf("%.2f", commission);}
            else if (town.equals("Varna")){
            commission = volumeSales * 0.045;
            System.out.printf("%.2f", commission);}
           else if (town.equals("Plovdiv")){
                commission = volumeSales * 0.055;
            System.out.printf("%.2f", commission);}
            else {System.out.println("error");}
        }
else if (volumeSales > 500 && volumeSales <= 1000){
    if (town.equals("Sofia")){
        commission = volumeSales * 0.07;
        System.out.printf("%.2f", commission);
    } else if (town.equals("Varna")){
        commission = volumeSales * 0.075;
        System.out.printf("%.2f", commission);
    } else if (town.equals("Plovdiv")){
        commission = volumeSales * 0.08;
        System.out.printf("%.2f", commission);
    } else {
        System.out.println("error");}
        }
else if (volumeSales > 1000 && volumeSales <= 10000){
    if (town.equals("Sofia")) {
        commission = volumeSales * 0.08;
        System.out.printf("%.2f", commission);
    } else if(town.equals("Varna")) {
        commission = volumeSales * 0.1;
        System.out.printf("%.2f", commission);
    }else if (town.equals("Plovdiv")){
        commission = volumeSales * 0.12;
        System.out.printf("%.2f", commission);
    } else {
        System.out.println("error");}
        }
else if (volumeSales > 10000){
    if(town.equals("Sofia")){
        commission = volumeSales * 0.12;
        System.out.printf("%.2f", commission);
    }else if(town.equals("Varna")){
        commission = volumeSales * 0.13;
        System.out.printf("%.2f", commission);
    }else if (town.equals("Plovdiv")){
        commission = volumeSales * 0.145;
        System.out.printf("%.2f", commission);
    }else {
        System.out.println("error");}
        }

else {System.out.println("error");}

    }
}
