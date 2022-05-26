import java.util.Scanner;

public class SchollCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
      double sumNights = 0.0;
      String sport = "";

        switch (season){
            case "Winter":
                if (gender.equals("mixed")){
                    if (students >= 10 && students < 20){
                        sumNights = nights * 10.0 * students * 0.95;}
                    else if (students >= 20 && students < 50){
                        sumNights = nights * 10.0 * students * 0.85;
                    }else if (students >= 50){
                        sumNights = nights * 10.0 * students * 0.50;
                    } else {sumNights = nights * 10.0 * students;}
                }
            if ((gender.equals("girls")) || (gender.equals("boys"))){
                if (students >= 10 && students < 20){
                sumNights = nights * 9.60 * students * 0.95;}
                else if (students >= 20 && students < 50){
                    sumNights = nights * 9.60 * students * 0.85;
                }else if (students >= 50){
                    sumNights = nights * 9.60 * students * 0.50;
                } else {sumNights = nights * 9.60 * students;}
            }
            if (gender.equals("girls")){
                sport = "Gymnastics";
            }else if (gender.equals("boys")){
                sport = "Judo";
            } else if (gender.equals("mixed")){
                sport = "Ski";
            } break;
            case "Spring":
                if (gender.equals("mixed")){
                    if (students >= 10 && students < 20){
                        sumNights = nights * 9.50 * students * 0.95;}
                    else if (students >= 20 && students < 50){
                        sumNights = nights * 9.50 * students * 0.85;
                    }else if (students >= 50){
                        sumNights = nights * 9.50 * students * 0.50;
                    } else {sumNights = nights * 9.50 * students;}
                }
                if ((gender.equals("girls")) || (gender.equals("boys"))){
                    if (students >= 10 && students < 20){
                        sumNights = nights * 7.20 * students * 0.95;}
                    else if (students >= 20 && students < 50){
                        sumNights = nights * 7.20 * students * 0.85;
                    }else if (students >= 50){
                        sumNights = nights * 7.20 * students * 0.50;
                    } else {sumNights = nights * 7.20 * students;}
                }
                if (gender.equals("girls")){
                    sport = "Athletics";
                }else if (gender.equals("boys")){
                    sport = "Tennis";
                } else if (gender.equals("mixed")){
                    sport = "Cycling";
                } break;
            case "Summer":

                if (gender.equals("mixed")){
                    if (students >= 10 && students < 20){
                        sumNights = nights * 20.0 * students * 0.95;}
                    else if (students >= 20 && students < 50){
                        sumNights = nights * 20.0 * students * 0.85;
                    }else if (students >= 50){
                        sumNights = nights * 20.0 * students * 0.50;
                    } else {sumNights = nights * 20.0 * students;}
                }
                if ((gender.equals("girls")) || (gender.equals("boys"))){
                    if (students >= 10 && students < 20){
                        sumNights = nights * 15.0 * students * 0.95;}
                    else if (students >= 20 && students < 50){
                        sumNights = nights * 15.0 * students * 0.85;
                    }else if (students >= 50){
                        sumNights = nights * 15.0 * students * 0.50;
                    } else {sumNights = nights * 15.0 * students;}
                }
                if (gender.equals("girls")){
                    sport = "Volleyball";
                }else if (gender.equals("boys")){
                    sport = "Football";
                } else if (gender.equals("mixed")){
                    sport = "Swimming";
                } break;


        }

        System.out.printf("%s %.2f lv.", sport, sumNights);

    }
}
