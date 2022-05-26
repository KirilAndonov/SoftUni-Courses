import java.util.Scanner;

public class FlowerShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);

        int work = 2;
        double totalFlowers = hrizantemi + roses + tulips;
double sumForBuket = 0.0;

        switch (season){
            case "Spring":
            case "Summer":
                if (symbol == 'Y'){
                    sumForBuket = ((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 1.15;
                    if ((season.equals("Spring")) && (tulips > 7) && (totalFlowers > 20)){
                        sumForBuket = ((((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 1.15) * 0.95) * 0.80;
                    } else if ((season.equals("Spring")) && (tulips > 7)){
                        sumForBuket = (((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 1.15) * 0.95;
                    }
                    else if(totalFlowers > 20){
                          sumForBuket = (((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 1.15) * 0.80;
                    }
                }
                else if (symbol == 'N'){
                    sumForBuket =((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50));
                    if ((season.equals("Spring")) && (tulips > 7) && (totalFlowers > 20)){
                        sumForBuket = (((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 0.95) * 0.80;
                    }else if ((season.equals("Spring")) && (tulips > 7)){
                        sumForBuket = (((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 1.15) * 0.95;
                    }
                    else if(totalFlowers > 20){
                          sumForBuket = ((hrizantemi * 2.0) + (roses * 4.10) + (tulips * 2.50)) * 0.80;
                    }
                } break;

            case "Winter":
            case "Autumn":
                if (symbol == 'Y'){
                    sumForBuket = ((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15)) * 1.15;
                    if ((season.equals("Winter")) && (roses >= 10 ) && (totalFlowers > 20)){
                        sumForBuket = ((((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15)) * 1.15) * 0.90) * 0.80;
                    } else if(totalFlowers > 20){
                        sumForBuket = (((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15)) * 1.15) * 0.80;
                    }
                }
                else if (symbol == 'N'){
                    sumForBuket =((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15));
                    if ((season.equals("Winter")) && (roses >= 10) && (totalFlowers > 20)){
                        sumForBuket = (((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15)) * 0.90) * 0.80;
                    }else if(totalFlowers > 20){
                        sumForBuket = ((hrizantemi * 3.75) + (roses * 4.50) + (tulips * 4.15)) * 0.80;
                    }
                } break;

        }
        double total = work + sumForBuket;
        System.out.printf("%.2f", total);
    }
}
