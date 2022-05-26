import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String comment = scanner.nextLine();

double price = 0.0;
        switch (typeRoom){
            case "room for one person":
                if(day < 10){
                    if (comment.equals("positive")) {
                    price = ((day - 1) * 18.0) * 1.25;
                } else if (comment.equals("negative")){
                    price = ((day - 1) * 18.0) * 0.90;
                }

                }

               else if (day <= 15){
                    if (comment.equals("positive")) {
                        price = ((day - 1) * 18.0) * 1.25;
                    } else if (comment.equals("negative")){
                        price = ((day - 1) * 18.0) * 0.90;
                    }
                }

               else {
                    if (comment.equals("positive")) {
                        price = ((day - 1) * 18.0) * 1.25;
                    } else if (comment.equals("negative")){
                        price = ((day - 1) * 18.0) * 0.90;
                    }
                }

                break;
            case "apartment":
                if(day < 10){
                    if (comment.equals("positive")) {
                        price = (((day - 1) * 25.0) * 0.70) * 1.25;
                    } else if (comment.equals("negative")){
                        price = (((day - 1) * 25.0) * 0.70) * 0.90;
                    }
                }

                else if (day <= 15){
                    if (comment.equals("positive")) {
                        price = (((day - 1) * 25.0) * 0.65) * 1.25;
                    } else if (comment.equals("negative")){
                        price = (((day - 1) * 25.0) * 0.65) * 0.90;
                    }
                }

                else {
                    if (comment.equals("positive")) {
                        price = (((day - 1) * 25.0) * 0.50) * 1.25;
                    } else if (comment.equals("negative")){
                        price = (((day - 1) * 25.0) * 0.50) * 0.90;
                    }
                }
                break;
            case "president apartment":
                if(day < 10){
                if (comment.equals("positive")) {
                    price = (((day - 1) * 35.0) * 0.90) * 1.25;
                } else if (comment.equals("negative")){
                    price = (((day - 1) * 35.0) * 0.90) * 0.90;
                }

                }

                else if (day <= 15){
                    if (comment.equals("positive")) {
                    price = (((day - 1) * 35.0) * 0.85) * 1.25;
                } else if (comment.equals("negative")){
                    price = (((day - 1) * 35.0) * 0.85) * 0.90;
                }

                }

                else {if (comment.equals("positive")) {
                    price = (((day - 1) * 35.0) * 0.80) * 1.25;
                } else if (comment.equals("negative")){
                    price = (((day - 1) * 35.0) * 0.80) * 0.90;
                }

                }
               break;
        }
        System.out.printf("%.2f", price);
    }
}
