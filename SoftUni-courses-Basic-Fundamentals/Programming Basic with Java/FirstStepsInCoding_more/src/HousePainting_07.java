import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightHous = Double.parseDouble(scanner.nextLine());
    double lenghtSideWall =Double.parseDouble(scanner.nextLine());
    double heightroof = Double.parseDouble(scanner.nextLine());

    //. Разхода на зелената боя е 1 литър за 3.4 м2, а на червената – 1 литър за 4.3 м2.
        //•	Предната и задната стена са квадрати със страна „x“
        //o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        //•	Страничните стени са правоъгълници със страни „x“ и „y“
        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5м
        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“
        //Трябва да пресметнете площта на всички страни и площта на покрива, за да
        //намерите колко литра от всяка боя ще са нужни
        double greenAreaFront = ((heightHous * heightHous) -(1.2 * 2) + (heightHous * heightHous));
        double greenAreaSide = ((heightHous * lenghtSideWall) - (1.5 * 1.5)) * 2.0;
        double greenPaintLiters = ( greenAreaFront + greenAreaSide) / 3.4;
        double redAreaRoofTriangle = (heightHous * heightroof / 2) * 2.0;
        double redAreaRoofSide = (heightHous * lenghtSideWall) * 2.0;
        double redPaintLiters = (redAreaRoofSide + redAreaRoofTriangle) / 4.3;
        System.out.printf("%.2f %n ", greenPaintLiters);
        System.out.printf("%.2f ", redPaintLiters);


    }
}
