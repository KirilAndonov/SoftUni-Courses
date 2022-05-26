import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        switch (town){
            case "Sofia":
                if (product.equals("coffee")){
                     price = number * 0.50;
                    System.out.printf("%.1f", price);}
                else if (product.equals("water")){
                    price = number * 0.80;
                    System.out.printf("%.1f", price);
                } else if (product.equals("beer")){
                    price = number * 1.20;
                    System.out.printf("%.1f", price);
                }else if(product.equals("sweets")){
                    price = number * 1.45;
                    System.out.printf("%.4f", price);
                }else if (product.equals("peanuts")){
                    price = number * 1.60;
                    System.out.printf("%.1f", price);
                } break;
            case "Plovdiv":
                if (product.equals("coffee")){
                    price = number * 0.40;
                    System.out.printf("%.1f", price);}
                else if (product.equals("water")){
                    price = number * 0.70;
                    System.out.printf("%.1f", price);
                } else if (product.equals("beer")){
                    price = number * 1.15;
                    System.out.printf("%.1f", price);
                }else if(product.equals("sweets")){
                    price = number * 1.30;
                    System.out.printf("%.4f", price);
                }else if (product.equals("peanuts")){
                    price = number * 1.50;
                    System.out.printf("%.1f", price);
                } break;
            case "Varna":
                if (product.equals("coffee")){
                    price = number * 0.45 ;
                    System.out.printf("%.1f", price);}
                else if (product.equals("water")){
                    price = number * 0.70;
                    System.out.printf("%.1f", price);
                } else if (product.equals("beer")){
                    price = number * 1.10;
                    System.out.printf("%.1f", price);
                }else if(product.equals("sweets")){
                    price = number * 1.35;
                    System.out.printf("%.4f", price);
                }else if (product.equals("peanuts")){
                    price = number * 1.55;
                    System.out.printf("%.1f", price);
                }break;


        }
    }
}
