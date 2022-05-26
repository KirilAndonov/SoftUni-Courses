import java.util.Scanner;
public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double kiloes = Double.parseDouble(scanner.nextLine());


        double price = 0.0;
        if ((day.equals("Monday")) || (day.equals("Tuesday")) || (day.equals("Wednesday")) || (day.equals("Thursday")) || (day.equals("Friday"))){
       if (fruit.equals("banana")) {
           price = 2.50;}
       else if (fruit.equals("apple")){
           price = 1.20;}
       else if (fruit.equals("orange")){
           price = 0.85;}
       else if (fruit.equals("grapefruit")){
           price = 1.45;}
       else if (fruit.equals("kiwi")){
           price = 2.70;}
       else if (fruit.equals("pineapple")){
           price = 5.50;}
       else if (fruit.equals("grapes")){
           price = 3.85;}}

        else if ((day.equals("Saturday")) || (day.equals("Sunday"))) {

              if (fruit.equals("banana")) {
                 price = 2.70;}
              else if (fruit.equals("apple")){
                 price = 1.25;}
              else if (fruit.equals("orange")){
                 price = 0.90;}
              else if (fruit.equals("grapefruit")){
                 price = 1.60;}
              else if (fruit.equals("kiwi")){
                 price = 3.00;}
              else if (fruit.equals("pineapple")){
                 price = 5.60;}
             else if (fruit.equals("grapes")){
                 price = 4.20;}}

          if (price == 0.0) {System.out.println("error");}
         else { double result = kiloes * price;
              System.out.printf("%.2f", result);
          }

        }
}

